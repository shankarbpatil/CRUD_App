package com.employees.crud.repository;

import com.employees.crud.model.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
}

