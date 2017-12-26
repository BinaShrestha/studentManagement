/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itntraining.studentmanagement.services;

import com.itntraining.studentmanagement.DepartmentDTO;
import com.itntraining.studentmanagement.StudentDTO;
import com.itntraining.studentmanagement.entities.Department;
import com.itntraining.studentmanagement.entities.Student;
import com.itntraining.studentmanagement.repositories.DepartmentRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<DepartmentDTO> findAllDepartments() {
        List<Department> departmentList=departmentRepository.findAll();
    return departmentList
            .stream()
            .map(departmentDToConverter)
            .collect(Collectors.toList());
    }
    

private Function<Department, DepartmentDTO> departmentDToConverter=(d)->{
DepartmentDTO dto=new DepartmentDTO();
dto.setDepartmentId(d.getDepartmentId());
dto.setDepartmentName(d.getDepartmentName());
List<StudentDTO>studentList=new ArrayList<>();
for(Student s: d.getStudentList()){
    StudentDTO stdDTO=new StudentDTO();
    stdDTO.setFirstName(s.getFirstName());
    stdDTO.setLastName(s.getLastName());
    stdDTO.setAddress(s.getAddress());
    studentList.add(stdDTO);
    
    
}
dto.setStudentList(studentList);
return dto;
};

    @Override
    public List<String> findAllDepartNames() {
return departmentRepository.findAll().stream().map(d -> d.getDepartmentName()).collect(Collectors.toList());

    }
}