package com.cognizant.insurance.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Pratik K, Pratik B, Shubham, Kavya
 * 
 * 		model class for PatientDetail which is 
 * 		a model class in ip-treatments-microservice but is
 * 	    used by insurance-claim-microservice
 * 		using Feign Client
 * 
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDetail {
	public PatientDetail()
	{}
	

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
	/**
	 * instance variables
	 * 
	 * @Id helps in defining the primary key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;
	private String ailment;
	private String treatmentPackageName;
	private String treatmentCommencementDate;

}
