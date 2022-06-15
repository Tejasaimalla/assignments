
package com.zensar.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.purchase.entity.Coupon;
import com.zensar.purchase.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository couponRepository;

	@Override
	public Coupon getCoupon(int couponId) {
		// TODO Auto-generated method stub
		return couponRepository.findById(couponId).get();
	}

	@Override
	public List<Coupon> getAllCoupons() {
		// TODO Auto-generated method stub
		return couponRepository.findAll();
	}

	@Override
	public void insertCoupon(Coupon coupon) {

		couponRepository.save(coupon);
	}

	@Override
	public void updateCoupon(int couponId, Coupon coupon) {

		couponRepository.save(coupon);
	}

	@Override
	public void deleteCoupon(int couponId) {
		couponRepository.deleteById(couponId);

	}

}
