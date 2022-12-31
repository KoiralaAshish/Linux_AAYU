package com.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue
	private int patientId;
	private String sex;
	private int age;
	private String bloodGroup;
	private String PatientCase;
	private String emergencyStatus;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getPatientCase() {
		return PatientCase;
	}
	public void setPatientCase(String patientCase) {
		PatientCase = patientCase;
	}
	public String getEmergencyStatus() {
		return emergencyStatus;
	}
	public void setEmergencyStatus(String emergencyStatus) {
		this.emergencyStatus = emergencyStatus;
	}
	
	
	
	
	
	
}
