package com.example.datamapping.datamappingtuts.controllers;

import com.example.datamapping.datamappingtuts.entities.EmployeeEntity;
import com.example.datamapping.datamappingtuts.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController( EmployeeService employeeService) {
      this.employeeService = employeeService;
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId)
    {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping(path = "/create-new-employee")
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity)
    {
        return employeeService.createNewEmployee(employeeEntity);
    }


}
