package com.example.demo.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	long id;
	@Column(name="Staffname")
	String Staffname;
	@Column(name="password")
	String password;
	@Column(name="contactno")
	String contact_no;

	@OneToMany
	List<Exam>exam;
	@OneToMany
	List<Student>student;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStaffname() {
		return Staffname;
	}
	public void setStaffname(String staffname) {
		Staffname = staffname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public List<Exam> getExam() {
		return exam;
	}
	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Staff(long id, String staffname, String password, String contact_no, List<Exam> exam,
			List<Student> student) {
		super();
		this.id = id;
		Staffname = staffname;
		this.password = password;
		this.contact_no = contact_no;
		this.exam = exam;
		this.student = student;
	}
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", Staffname=" + Staffname + ", password=" + password + ", contact_no=" + contact_no
				+ ", exam=" + exam + ", student=" + student + "]";
	}
}