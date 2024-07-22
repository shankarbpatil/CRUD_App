package com.employees.crud.controller;

import com.employees.crud.model.Employees;

import com.employees.crud.service.EmployeesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping
    public List<Employees> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employees> getEmployeesById(@PathVariable Long id) {
        return employeesService.getEmployeesById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employees createEmployees(@RequestBody Employees employees) {
        return employeesService.createEmployees(employees);
    }

   /* @PutMapping("/{id}")
    public ResponseEntity<Employees> updateEmployees(@PathVariable Long id, @RequestBody Employees employeesDetails) {
        Employees updatedEmployees = employeesService.updateEmployees(id, employeesDetails);
        return ResponseEntity.ok(updatedEmployees);
    }
*/
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployees(@PathVariable Long id) {
        
        employeesService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
