package com.restapi.restApiByDurgesh.services;

import java.util.List;

import com.restapi.restApiByDurgesh.entities.Course;


public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course newcourse);
	public Course updateCourseById(long parseLong);
}
