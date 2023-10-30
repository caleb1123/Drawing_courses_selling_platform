package com.main.drawingcourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.main.drawingcourse.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

	@Query(value = "SELECT * FROM LESSONS l WHERE l.course_id = :id", nativeQuery = true)
	List<Lesson> findLessonsByID(@Param("id") int id);

	@Query(value = "SELECT  COUNT(l.lesson_id) AS lesson_count FROM courses c LEFT JOIN lessons l ON c.course_id = l.course_id", nativeQuery = true)
	int countLession();

}