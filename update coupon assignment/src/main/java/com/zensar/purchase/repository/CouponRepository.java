package com.zensar.purchase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.purchase.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
