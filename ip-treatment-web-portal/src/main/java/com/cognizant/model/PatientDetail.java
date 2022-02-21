package com.cognizant.model;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		model class for Patient Details
 * 
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDetail {
public PatientDetail() {
	// TODO Auto-generated constructor stub
}

	public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAilment() {
	return ailment;
}

public void setAilment(String ailment) {
	this.ailment = ailment;
}

public String getTreatmentPackageName() {
	return treatmentPackageName;
}

public void setTreatmentPackageName(String treatmentPackageName) {
	this.treatmentPackageName = treatmentPackageName;
}

public String getTreatmentCommencementDate() {
	return treatmentCommencementDate;
}

public void setTreatmentCommencementDate(String treatmentCommencementDate) {
	this.treatmentCommencementDate = treatmentCommencementDate;
}

	public PatientDetail(long id, String name, int age, String ailment, String treatmentPackageName,
		String treatmentCommencementDate) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.ailment = ailment;
	this.treatmentPackageName = treatmentPackageName;
	this.treatmentCommencementDate = treatmentCommencementDate;
}

	private long id;
	private String name;
	private int age;
	private String ailment;
	private String treatmentPackageName;
	private String treatmentCommencementDate;
}
