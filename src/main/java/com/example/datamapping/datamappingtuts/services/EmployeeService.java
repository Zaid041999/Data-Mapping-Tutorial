package com.example.datamapping.datamappingtuts.services;

import com.example.datamapping.datamappingtuts.entities.EmployeeEntity;
import com.example.datamapping.datamappingtuts.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity)
    {
        return employeeRepository.save(employeeEntity);
    }
}
