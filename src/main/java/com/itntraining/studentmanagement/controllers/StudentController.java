/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itntraining.studentmanagement.controllers;

import com.itntraining.studentmanagement.StudentDTO;
import com.itntraining.studentmanagement.entities.Department;
import com.itntraining.studentmanagement.entities.Student;
import com.itntraining.studentmanagement.repositories.DepartmentRepository;
import com.itntraining.studentmanagement.repositories.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
     @Autowired
     private DepartmentRepository departmentRepository;
    @PostMapping("/students")
    public ResponseEntity<?>saveStudent(@RequestBody StudentDTO studentDTO){
        Student student=new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setAddress(studentDTO.getAddress());
       

        Department department=departmentRepository.findByDepartmentName(studentDTO.getDepartmentName());
        student.setDepartment(department);
        studentRepository.save(student);
        return ResponseEntity.ok(student);
     
        
    }
    @GetMapping("/students")
    public ResponseEntity<?>getAllStudents(){
        List<Student>studentList=studentRepository.findAll();
        return ResponseEntity.ok(studentList);
    }
   @PutMapping("/students")
   public ResponseEntity<?> updateStudent(@RequestParam Long studentId,@RequestBody StudentDTO studentDTO){
     Student oldStudent= studentRepository.findOne(studentId);
     oldStudent.setFirstName(studentDTO.getFirstName());
     oldStudent.setLastName(studentDTO.getLastName());
     oldStudent.setAddress(studentDTO.getAddress());
     
       return ResponseEntity.ok("updated")  ;
   }

   @DeleteMapping("/students")
public ResponseEntity<?>deleteStudent(@RequestParam Long studentId){
    studentRepository.delete(studentId);
    return ResponseEntity.ok("Deleted");
}

}       
    

