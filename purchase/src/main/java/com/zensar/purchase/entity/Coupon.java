package com.zensar.purchase.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int couponId;

	private String couponCode;

	private int couponExpiryDate;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponCode, int couponExpiryDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponExpiryDate = couponExpiryDate;
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

	public int getCouponExpiryDate() {
		return couponExpiryDate;
	}

	public void setCouponExpiryDate(int couponExpiryDate) {
		this.couponExpiryDate = couponExpiryDate;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpiryDate=" + couponExpiryDate
				+ "]";
	}

}
