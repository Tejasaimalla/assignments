package com.zensar.purchase.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.purchase.dto.CouponDto;
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
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponId") int couponId) {
		return new ResponseEntity<CouponDto>(couponService.getCoupon(couponId), HttpStatus.OK);

	}

	@GetMapping(value = { "/coupons", "/listOfCoupons" })
	public List<CouponDto> getAllCoupons() {
		return couponService.getAllCoupons();

	}

	@PostMapping(value = "/coupons")

	public ResponseEntity<CouponDto> insertCoupon(@RequestBody CouponDto couponDto) {

		return new ResponseEntity<CouponDto>(couponService.insertCoupon(couponDto), HttpStatus.CREATED);

	}

	@PutMapping(value = "/coupons/{couponId}")
	public ResponseEntity<String> updateCoupon(@PathVariable("couponId") int couponId,
			@RequestBody CouponDto couponDto) {
		return new ResponseEntity<String>("Coupon updated Succesfully ", HttpStatus.OK);
		// public void updateCoupon(@PathVariable("couponId") int couponId, @RequestBody
		// CouponDto couponDto) {
		// couponService.updateCoupon(couponId, couponDto);

		// couponService.updateCoupon(couponId, coupon);

	}

	// http://localhost:1234/couponss -> Delete
	@DeleteMapping("/coupons/{couponId}")

	public ResponseEntity<String> deleteCoupon(@PathVariable("couponId") int couponId) {

		couponService.deleteCoupon(couponId);
		return new ResponseEntity<String>("Coupon deleted successfully ", HttpStatus.OK);

		// public void deleteCoupon(@PathVariable("couponId") int couponId) {

		// couponService.deleteCoupon(couponId);

	}

}
