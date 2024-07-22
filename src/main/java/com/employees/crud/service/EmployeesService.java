package com.employees.crud.service;




import com.employees.crud.model.Employees;
import com.employees.crud.repository.EmployeesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }

    public Optional<Employees> getEmployeesById(Long id) {
        return employeesRepository.findById(id);
    }

    public Employees createEmployees(Employees employees) {
        return employeesRepository.save(employees);
    }

   /* public Employees updateEmployees(Long id, Employees employeesDetails) {
        Employees employees = employeesRepository.findById(id).orElseThrow();
        employees.setFirstName(employeesDetails.getFirstName());
       
        employees.setLastName(employeesDetails.getLastName());
        employees.setEmail(employeesDetails.getEmail());
        return employeesRepository.save(employees);
    }
*/
    public void deleteEmployee(Long id) {
    	employeesRepository.deleteById(id);
    }
}

