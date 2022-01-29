package com.Exam.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Exam.Exception.RecordNotFoundException;
import com.Exam.Model.Course;
import com.Exam.Model.Question;
import com.Exam.Service.CourseService;
import com.Exam.Service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionService service;

	@Autowired
	CourseService courseService;

	@PostMapping("/createQuestion")
	public ResponseEntity<Question> createQuestion(@Validated @RequestBody Question ques) {
		Question a = service.addQuestion(ques);
		System.out.println(a);
		return new ResponseEntity<Question>(a, HttpStatus.OK);
	}

	@GetMapping("/{q_id}")
	public ResponseEntity<Question> findByQuestionId(@PathVariable int q_id) {
		Optional<Question> ques = service.findByQuestionId(q_id);

		if (ques.isPresent()) {
			return new ResponseEntity<>(ques.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("record not found");
		}
	}

	@GetMapping("/fetchQuestion")
	public ResponseEntity<List<Question>> fetchQuestion() {
		List<Question> ques = service.findAllQuestion();
		return ResponseEntity.ok().body(ques);
	}

	@PostMapping("/addQuestion")
	public Question addQuestion(@RequestBody Question question) {
		Course courseResponse = courseService.findById(question.getCourse().getCourse_id());
		question.setCourse(courseResponse);
		return service.addQuestion(question);

	} 

}
