package com.zensar.purchase.service;

import java.util.List;


import com.zensar.purchase.dto.CouponDto;

public interface CouponService {
	public CouponDto getCoupon(int couponId);

	public List<CouponDto> getAllCoupons();

	public CouponDto insertCoupon(CouponDto coupon);

	public void updateCoupon(int couponId, CouponDto coupon);

	public void deleteCoupon(int CouponId);

}
