package com.zensar.purchase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.purchase.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

	@Query(value = "select * from Coupon  where coupon_code=?1", nativeQuery = true)
	List<Coupon> test(@Param("code") String couponCode);

	// List<Coupon> findByCouponCodeAndCouponExpiry(String couponCode, int
	// couponExpiry);
	@Query("from Coupon c where c.couponCode=?1 and c.couponExpiry=?2")
	List<Coupon> test1(@Param("code") String couponCode, @Param("Expiry") int expiry);

}
