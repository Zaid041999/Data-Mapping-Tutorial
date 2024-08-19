package com.example.datamapping.datamappingtuts.repositories;

import com.example.datamapping.datamappingtuts.entities.DepartmentEntity;
import com.example.datamapping.datamappingtuts.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}
