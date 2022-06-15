package com.zensar.purchase.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.purchase.entity.Coupon;
import com.zensar.purchase.service.CouponService;

@RestController
@RequestMapping(value = "/coupon-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class CouponController {
	private List<Coupon> coupons = new ArrayList<Coupon>();

	public CouponController() {
		coupons.add(new Coupon(100, "GRTUBB", 10 - 12 - 2022));
		coupons.add(new Coupon(101, "ABCDE", 14 - 10 - 2023));
		coupons.add(new Coupon(102, "xutdrdb", 8 - 1 - 2023));
	}

	@Autowired
	private CouponService couponService;

	@GetMapping(value = "/coupons/{couponId}")
	public Coupon getCoupon(@PathVariable("couponId") int couponId) {
		return couponService.getCoupon(couponId);

	}

	@GetMapping(value = { "/coupons", "/listOfCoupons" })
	public List<Coupon> getAllCoupons() {
		return couponService.getAllCoupons();

	}

	@PostMapping(value = "/coupons")
	public void insertCoupon(@RequestBody Coupon coupon) {
		couponService.insertCoupon(coupon);

	}

	@PutMapping(value = "/coupons/{couponId}")
	public void updateCoupon(@PathVariable("couponId") int couponId, @RequestBody Coupon coupon) {

		couponService.updateCoupon(couponId, coupon);

	}

	// http://localhost:1234/couponss -> Delete
	@DeleteMapping("/coupons/{couponId}")
	public void deleteCoupon(@PathVariable("couponId") int couponId) {

		couponService.deleteCoupon(couponId);

	}

}
