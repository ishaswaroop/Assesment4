package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exam")
public class Exam {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	long examid;
	@Column(name="name")
	String name;
	@Column(name="stream")
	String stream;
	@Column (name="course")
	String course;
	@Column(name="date")
	Date date;
	@Column(name="No.ofQues")
	int questions;
	@Column(name="status")
	String status;
	public Exam(long examid, String name, String stream, String course, Date date, int questions, String status) {
		super();
		this.examid = examid;
		this.name = name;
		this.stream = stream;
		this.course = course;
		this.date = date;
		this.questions = questions;
		this.status = status;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getExamid() {
		return examid;
	}
	public void setExamid(long examid) {
		this.examid = examid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuestions() {
		return questions;
	}
	public void setQuestions(int questions) {
		this.questions = questions;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", name=" + name + ", stream=" + stream + ", course=" + course + ", date="
				+ date + ", questions=" + questions + ", status=" + status + "]";
	}
	

}

