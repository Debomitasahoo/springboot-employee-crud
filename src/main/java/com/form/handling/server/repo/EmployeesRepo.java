package com.form.handling.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.handling.server.entity.Employees;

@Repository
public interface EmployeesRepo extends JpaRepository<Employees, Long> {}

