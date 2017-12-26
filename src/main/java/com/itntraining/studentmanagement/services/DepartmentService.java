/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itntraining.studentmanagement.services;

import com.itntraining.studentmanagement.DepartmentDTO;
import java.util.List;

/**
 *
 * @author hp
 */
public interface DepartmentService {
    List<DepartmentDTO> findAllDepartments();
    List<String> findAllDepartNames();    
}
