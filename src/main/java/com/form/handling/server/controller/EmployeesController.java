package com.form.handling.server.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.form.handling.server.entity.Employees;
import com.form.handling.server.service.EmployeesService;

@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
@RestController
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/getEmp")
    public List<Employees> getEmp() {
        return employeesService.getEmployees();
    }

    @PostMapping("/addEmp")
    public Employees addEmp(@RequestBody Employees emp) {
        return employeesService.addEmployee(emp);
    }

    @PutMapping("/updateEmp/{id}")
    public Employees updateEmp(@PathVariable Long id, @RequestBody Employees updatedEmp) {
        return employeesService.updateEmployee(id, updatedEmp);
    }

    @DeleteMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable Long id) {
        return employeesService.deleteEmployee(id);
    }
}
