package com.form.handling.server.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.form.handling.server.entity.Employees;
import com.form.handling.server.repo.EmployeesRepo;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepo employeesRepo;

    public List<Employees> getEmployees() {
        return employeesRepo.findAll();
    }

    public Employees addEmployee(Employees emp) {
        return employeesRepo.save(emp);
    }

    public Employees updateEmployee(Long id, Employees updatedEmp) {
        Optional<Employees> existingEmpOpt = employeesRepo.findById(id);
        if (existingEmpOpt.isPresent()) {
            Employees existingEmp = existingEmpOpt.get();
            existingEmp.setName(updatedEmp.getName());
            existingEmp.setAge(updatedEmp.getAge());
            existingEmp.setSalary(updatedEmp.getSalary());
            return employeesRepo.save(existingEmp);
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }

    public String deleteEmployee(Long id) {
        employeesRepo.deleteById(id);
        return "Employee deleted successfully!";
    }
}
