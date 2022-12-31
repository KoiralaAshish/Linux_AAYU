package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{

}
