package com.zensar.purchase.service;

import java.util.List;

import com.zensar.purchase.entity.Coupon;

public interface CouponService {
	public Coupon getCoupon(int couponId);

	public List<Coupon> getAllCoupons();

	public void insertCoupon(Coupon coupon);

	public void updateCoupon(int couponId, Coupon coupon);

	public void deleteCoupon(int CouponId);

}
