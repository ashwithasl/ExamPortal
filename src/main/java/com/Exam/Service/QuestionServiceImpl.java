package com.Exam.Service;

import java.util.List;
import java.util.Optional;

import com.Exam.Model.Question;

public interface QuestionServiceImpl {
	
	public Question addQuestion(Question ques);

	public Optional<Question> findByQuestionId(int q_id);

	public List<Question> findAllQuestion();

}
