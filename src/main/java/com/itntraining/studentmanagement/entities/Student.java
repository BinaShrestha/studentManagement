package com.itntraining.studentmanagement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Student {
	@Id
	@GeneratedValue
	@Column(name="studentId")
	
private Long studentId;
	@Column(name="firstName")
private String firstName;
	@Column(name="lastName")
private String lastName;
	//@JoinColumn(name= department_Id)
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
private Department department;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
