package com.Exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Exam.Model.Question;



public interface QuestionRepository extends JpaRepository<Question,  Integer> {
}
