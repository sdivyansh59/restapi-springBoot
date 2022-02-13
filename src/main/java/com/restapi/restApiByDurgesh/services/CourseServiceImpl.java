package com.restapi.restApiByDurgesh.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.restApiByDurgesh.entities.Course;

@Service
public class CourseServiceImpl  implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImpl () {
		list = new ArrayList<>();
		list.add(new Course(1, "spring boot course", " this course is very much broad"));
		list.add(new Course(2, "abc", " abcdereggff ggfgfgfgfgfg fgfgfg "));	
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c = null;
		for(Course course:list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	
	@Override
	public Course addCourse(Course newcourse) {
		// TODO Auto-generated method stub
		list.add(newcourse);
		return newcourse;
	}
	
}
