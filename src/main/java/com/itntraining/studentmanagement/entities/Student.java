package com.itntraining.studentmanagement.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
//@Table(name="student_info")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="student_Id")
	
private Long studentId;
	@Column(name="firstName",nullable=false)
private String firstName;
	@Column(name="lastName",nullable=false)
private String lastName;
        @Column(name="address")
private String address;
        @JoinColumn(name="department_Id")
        @JsonBackReference
	@ManyToOne

private Department department;

         public String getAddress() {
           return address;
        }

        public void setAddress(String address) {
        this.address = address;
         }

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
