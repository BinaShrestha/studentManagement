/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itntraining.studentmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class DepartmentDTO {
    private Long departmentId;
    private String departmentName;
    private List<StudentDTO> studentList=new ArrayList<>();
    private int size;

    public int getSize() {
        this.size= studentList.size();
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public List<StudentDTO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDTO> studentList) {
        this.studentList = studentList;
    }
    
    
}
