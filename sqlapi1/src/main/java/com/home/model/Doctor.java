package com.home.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Doctor {
	
@Id
@GeneratedValue
	private int doctorId;
private String doctorName;
private byte[] image;


private String contact_phone;







public String getContact_phone() {
	return contact_phone;
}
public void setContact_phone(String contact_phone) {
	this.contact_phone = contact_phone;
}

public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}




	
	
	
	
	
	
	
}
