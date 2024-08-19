package com.example.datamapping.datamappingtuts.controllers;

import com.example.datamapping.datamappingtuts.entities.DepartmentEntity;
import com.example.datamapping.datamappingtuts.services.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {


    private final DepartmentService departmentService;

    public DepartmentController( DepartmentService departmentService) {
               this.departmentService = departmentService;
    }

    @GetMapping(path = "/{departmentId}")
    public DepartmentEntity getDepartmentById(@PathVariable Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping(path = "/create-new-department")
    public DepartmentEntity createNewDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.createNewDepartment(departmentEntity);
    }

    @PutMapping(path = "/{departmentId}/manager/{employeeId}")
    public DepartmentEntity assignManagerToDepartment(@PathVariable Long departmentId,
                                                      @PathVariable Long employeeId){
        return departmentService.assignManagerToDepartment(departmentId,employeeId);

    }
    @GetMapping(path ="/assignedDepartmentOfManager/{employeeId}")
    public DepartmentEntity assignedDepartmentManager(@PathVariable Long employeeId){
        return departmentService.assignedDepartmentManager(employeeId);
    }
    @PutMapping(path = "/{departmentId}/worker/{employeeId}")
    public DepartmentEntity assignWorkerToDepartment(@PathVariable Long departmentId,
                                                      @PathVariable Long employeeId){
        return departmentService.assignWorkerToDepartment(departmentId,employeeId);

    }
    @PutMapping(path = "/{departmentId}/freelancer/{employeeId}")
    public DepartmentEntity assignFreelancerToDepartment(@PathVariable Long departmentId,
                                                     @PathVariable Long employeeId){
        return departmentService.assignFreelancerToDepartment(departmentId,employeeId);

    }


}
