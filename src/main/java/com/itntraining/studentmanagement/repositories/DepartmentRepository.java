package com.itntraining.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itntraining.studentmanagement.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
