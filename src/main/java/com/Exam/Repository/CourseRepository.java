package com.Exam.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Exam.Model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{


}
