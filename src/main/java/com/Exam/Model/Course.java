package com.Exam.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_id", length = 200, unique = true)
	private int course_id;

	@Column(name = "course_type", length = 200, unique = true)
	private String course_type;

	@OneToMany(mappedBy = "course",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Question> question;

	public Course() {

	}

	public Course(String course_type ) {
		this.course_type = course_type;
	}

	public Set<Question> getQuestion() {
		return question;
	}

	public void setQuestion(Set<Question> question) {
		this.question = question;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_type() {
		return course_type;
	}

	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_type=" + course_type + ", question=" + question + "]";
	}
	
}
