package com.main.drawingcourse.service;

import com.main.drawingcourse.dto.CourseModel;
import com.main.drawingcourse.entity.Course;

import java.util.List;

public interface ICourseService {
    CourseModel AddCourse(CourseModel courseModel);

    CourseModel GetCoursebyid(int id);

    List<CourseModel> findAll();
}