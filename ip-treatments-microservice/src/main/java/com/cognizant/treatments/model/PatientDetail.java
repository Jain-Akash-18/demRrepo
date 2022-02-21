package com.cognizant.treatments.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		model class for PackageDetail
 * 
 * 		@Entity indicates Spring Data JPA that it is an entity class for the
 *      application
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDetail {

	/**
	 * instance variables
	 * @Id for primary key attribute
	 * @SequenceGenerator @Generatedvalue to automatically generate id's
	 */
	
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "myDbSeq", initialValue = 1)
	@GeneratedValue(generator = "mySeqGen")
	private long id;

	private String name;

	private int age;

	private String ailment;

	private String treatmentPackageName;

	private String treatmentCommencementDate;

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

	public PatientDetail() {
		super();
	}

}
