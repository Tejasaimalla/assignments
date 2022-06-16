
package com.zensar.purchase.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
		Coupon getcoupon = couponRepository.findById(couponId).get();
		return modelMapper.map(getcoupon, CouponDto.class);

		// return dto;
	}

	@Override
	public List<CouponDto> getAllCoupons(int pageNumber, int pageSize) {

		// List<Coupon> listofCoupons = couponRepository.findAll();
		List<CouponDto> listofCouponDto = new ArrayList<CouponDto>();

		Page<Coupon> findAll = couponRepository.findAll(PageRequest.of(pageNumber, pageSize));

		List<Coupon> content = findAll.getContent();

		for (Coupon coupon : content) {
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
		Coupon coupon = modelMapper.map(couponDto, Coupon.class);

		couponRepository.save(coupon);
	}

	@Override
	public void deleteCoupon(int couponId) {
		couponRepository.deleteById(couponId);

	}

	public List<CouponDto> getByCouponName(String couponName) {
		// List<Coupon> coupons = couponRepository.test(couponName);
		List<CouponDto> couponDtos = newArrayList();

		List<Coupon> coupons = couponRepository.test(couponName);

		for (Coupon coupon : coupons)
			couponDtos.add(modelMapper.map(coupon, CouponDto.class));
		return couponDtos;

	}

	public List<CouponDto> findByCouponCodeAndCouponExpiry(String couponName, int expiry) {
		List<CouponDto> couponDtos = newArrayList();

		List<Coupon> coupons = couponRepository.test1(couponName, expiry);

		for (Coupon coupon : coupons)
			couponDtos.add(modelMapper.map(coupon, CouponDto.class));

		return couponDtos;
	}

	private List<CouponDto> newArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CouponDto> getByCouponCode(String couponCode) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public Coupon mapToEntity(CouponDto couponDto) { Coupon coupon = new
	 * Coupon(); coupon.setCouponId(couponDto.getCouponId());
	 * coupon.setCouponCode(couponDto.getCouponCode());
	 * coupon.setCouponExpiry(couponDto.getCouponExpiry());
	 * 
	 * return coupon;
	 * 
	 * }
	 */

}
