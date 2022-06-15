
package com.zensar.purchase.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.purchase.dto.CouponDto;
import com.zensar.purchase.entity.Coupon;
import com.zensar.purchase.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository couponRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CouponDto getCoupon(int couponId) {
		Coupon coupon = couponRepository.findById(couponId).get();
		return modelMapper.map(coupon, CouponDto.class);

		// return dto;
	}

	@Override
	public List<CouponDto> getAllCoupons() {

		List<Coupon> listofCoupons = couponRepository.findAll();
		List<CouponDto> listofCouponDto = new ArrayList<CouponDto>();

		for (Coupon coupon : listofCoupons) {
			// listofCouponDto.add(mapToDto(coupon));
			listofCouponDto.add(modelMapper.map(coupon, CouponDto.class));
		}
		return listofCouponDto;

		// return couponRepository.findAll();
	}

	@Override
	public CouponDto insertCoupon(CouponDto couponDto) {
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);
		Coupon insertedCoupon = couponRepository.save(coupon);

		return modelMapper.map(insertedCoupon, CouponDto.class);
	}

	@Override
	public void updateCoupon(int couponId, CouponDto couponDto) {
		Coupon coupon = mapToEntity(couponDto);

		couponRepository.save(coupon);
	}

	@Override
	public void deleteCoupon(int couponId) {
		couponRepository.deleteById(couponId);

	}

	public Coupon mapToEntity(CouponDto couponDto) {
		Coupon coupon = new Coupon();
		coupon.setCouponId(couponDto.getCouponId());
		coupon.setCouponCode(couponDto.getCouponCode());
		coupon.setCouponExpiry(couponDto.getCouponExpiry());

		return coupon;

	}

}
