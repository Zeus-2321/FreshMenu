package com.example.demo.Storage;

import com.example.demo.Entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage {

    private List<EmployeeEntity> EmployeeList;

    public List<EmployeeEntity> getEmployeeList() {
        if(EmployeeList==null) EmployeeList = new ArrayList<EmployeeEntity>();
        return EmployeeList;
    }

    public void setEmployeeList(List<EmployeeEntity> employeeList) {
        EmployeeList = employeeList;
    }
}
