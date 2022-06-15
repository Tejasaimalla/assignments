package com.zensar.springbootdemo.entity;

public class Coupon {
	
	private int couponId;
	
	private String couponName;
	
	private int couponType;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponName, int couponType) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponType = couponType;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public int getCouponType() {
		return couponType;
	}

	public void setCouponType(int couponType) {
		this.couponType = couponType;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponName=" + couponName + ", couponType=" + couponType + "]";
	}
	

}
