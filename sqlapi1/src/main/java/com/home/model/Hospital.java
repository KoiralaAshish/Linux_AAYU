package com.home.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;




@Entity
public class Hospital {
	
	@Id
	@GeneratedValue
private int hospitalId;
private String hospitalName;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "HospitalId")
private Set<Department> department = new HashSet<>();



public Set<Department> getDepartment() {
	return department;
}

public void setDepartment(Set<Department> department) {
	this.department = department;
}





public Integer getHospitalId() {
	return hospitalId;
}

public void setHospitalId(Integer hospitalId) {
	this.hospitalId = hospitalId;
}

public String getHospitalName() {
	return hospitalName;
}

public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}










}
