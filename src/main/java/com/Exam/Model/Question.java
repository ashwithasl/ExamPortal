package com.Exam.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "q_id", length = 200, unique = true)
	private int q_id;
	
	@Column(name = "q_name", length = 200, unique = true)
	private String q_name;

	@Column(name = "option_a", length = 200, unique = true)
	private String option_a;

	@Column(name = "option_b", length = 200, unique = true)
	private String option_b;

	@Column(name = "option_c", length = 200, unique = true)
	private String option_c;

	@Column(name = "option_d", length = 200, unique = true)
	private String option_d;

	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn( name = "course_course_id")
	private Course course;

	public Question() {

	}

	public Question(String q_name, String option_a, String option_b, String option_c, String option_d, Course course) {
		this.q_name = q_name;
		this.option_a = option_a;
		this.option_b = option_b;
		this.option_c = option_c;
		this.option_d = option_d;	
		this.course = course;

	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQ_name() {
		return q_name;
	}

	public void setQ_name(String q_name) {
		this.q_name = q_name;
	}

	public String getOption_a() {
		return option_a;
	}

	public void setOption_a(String option_a) {
		this.option_a = option_a;
	}

	public String getOption_b() {
		return option_b;
	}

	public void setOption_b(String option_b) {
		this.option_b = option_b;
	}

	public String getOption_c() {
		return option_c;
	}

	public void setOption_c(String option_c) {
		this.option_c = option_c;
	}

	public String getOption_d() {
		return option_d;
	}

	public void setOption_d(String option_d) {
		this.option_d = option_d;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", q_name=" + q_name + ", option_a=" + option_a + ", option_b=" + option_b
				+ ", option_c=" + option_c + ", option_d=" + option_d + ", course=" + course + "]";
	}

}
