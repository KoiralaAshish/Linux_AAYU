package com.home.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cases {
@Id
@GeneratedValue
	private int casesId;
	private String status;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="patientId")
	private Patient patient;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="doctorId")
	private Doctor doctor;
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public int getCasesId() {
		return casesId;
	}
	public void setCasesId(int casesId) {
		this.casesId = casesId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
	
	
	
	
	
	
	
}
