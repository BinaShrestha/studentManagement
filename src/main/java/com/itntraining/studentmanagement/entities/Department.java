package com.itntraining.studentmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_department")
public class Department {
	@Id
	@GeneratedValue
	@Column(name="department_id")
	private Long departmentId;
	@Column(name="department_name",nullable =false,unique=true)
	private String departmentName;
	public Department() {
	}
	
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
