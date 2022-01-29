package com.Exam.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Exam.Model.Question;
import com.Exam.Repository.QuestionRepository;

@Service
public class QuestionService implements QuestionServiceImpl {
	
	@Autowired
	QuestionRepository dao;
	
	public Question addQuestion(Question ques)
	{	
		Question q=dao.save(ques);
		return q;
	}
	
	@Override
	public Optional<Question> findByQuestionId(int q_id) {
		return dao.findById(q_id);
	}
	
	@Override
	public List<Question> findAllQuestion() {
		List<Question> ques=dao.findAll();
		return ques;
	}

}
