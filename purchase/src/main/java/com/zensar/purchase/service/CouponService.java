package com.zensar.purchase.service;

import java.util.List;

import com.zensar.purchase.dto.CouponDto;

public interface CouponService {
	public CouponDto getCoupon(int couponId);

	public List<CouponDto> getAllCoupons(int pageNumber, int page);

	public CouponDto insertCoupon(CouponDto coupon);

	public void updateCoupon(int couponId, CouponDto coupon);

	public void deleteCoupon(int CouponId);

	// List<CouponDto> getAllCoupons(int pageNumber, int pageSize);

	List<CouponDto> findByCouponCodeAndCouponExpiry(String couponCode, int expiry);

	List<CouponDto> getByCouponCode(String couponCode);

}
