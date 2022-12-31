package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.model.Cases;

public interface CasesRepo extends JpaRepository<Cases, Integer>{

}
