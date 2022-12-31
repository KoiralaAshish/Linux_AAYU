package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
