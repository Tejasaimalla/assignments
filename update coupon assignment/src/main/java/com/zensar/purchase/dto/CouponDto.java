package com.zensar.purchase.dto;

public class CouponDto {
	private int couponId;

	private String couponCode;

	private int couponExpiry;

	public CouponDto() {
		super();
	}

	public CouponDto(int couponId, String couponCode, int couponExpiry) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponExpiry = couponExpiry;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public int getCouponExpiry() {
		return couponExpiry;
	}

	public void setCouponExpiry(int couponExpiry) {
		this.couponExpiry = couponExpiry;
	}

	@Override
	public String toString() {
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpiry=" + couponExpiry
				+ "]";
	}
	

}
