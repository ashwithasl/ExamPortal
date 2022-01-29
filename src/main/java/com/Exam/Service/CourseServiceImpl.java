package com.Exam.Service;

import java.util.List;
import java.util.Optional;

import com.Exam.Model.Course;
import com.Exam.Model.Question;

public interface CourseServiceImpl {

	public Course addCourse(Course course);

	public Optional<Course> findByCourseId(int course_id);

	public Course findById(int course_id);

	public List<Course> findAllCourse();
	
	
	// public ResponseEntity<List<Course>> getCourseById(int course_id);

	// ResponseEntity<Course> getCourseById(int course_id);

}
