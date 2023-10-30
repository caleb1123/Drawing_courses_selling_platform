package com.main.drawingcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.drawingcourse.entity.Course_Order;

@Repository
public interface Course_OrderRepository extends JpaRepository<Course_Order, Integer> {
	@Query("SELECT SUM(c.price) FROM Course_Order co " + "JOIN co.course c " + "JOIN co.order o")
	Double getTotalSalesAmount();

	@Query(value = "select id from course_order where course_id = :cid AND order_id = :oid", nativeQuery = true)
	int findCourseAndOrderID(@Param("cid") int cid, @Param("oid") int oid);

}