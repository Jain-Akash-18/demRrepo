package com.cognizant.treatments.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 *         model class for PackageDetail
 * 
 * @Entity indicates Spring Data JPA that it is an entity class for the
 *         application
 * @Data is a convenient shortcut annotation that bundles the features
 *       of @ToString , @EqualsAndHashCode , @Getter / @Setter
 *       and @RequiredArgsConstructor together
 *
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TreatmentPlan {
  
	public TreatmentPlan()
	{}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PatientDetail getPtDetail() {
		return ptDetail;
	}

	public void setPtDetail(PatientDetail ptDetail) {
		this.ptDetail = ptDetail;
	}

	public String getTestDetails() {
		return testDetails;
	}

	public void setTestDetails(String testDetails) {
		this.testDetails = testDetails;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTreatmentCommencementDate() {
		return treatmentCommencementDate;
	}

	public void setTreatmentCommencementDate(String treatmentCommencementDate) {
		this.treatmentCommencementDate = treatmentCommencementDate;
	}

	public String getTreatmentEndDate() {
		return treatmentEndDate;
	}

	public void setTreatmentEndDate(String treatmentEndDate) {
		this.treatmentEndDate = treatmentEndDate;
	}

	public TreatmentPlan(long id, PatientDetail ptDetail, String testDetails, String packageName, String specialist,
			double cost, String status, String treatmentCommencementDate, String treatmentEndDate) {
		super();
		this.id = id;
		this.ptDetail = ptDetail;
		this.testDetails = testDetails;
		this.packageName = packageName;
		this.specialist = specialist;
		this.cost = cost;
		this.status = status;
		this.treatmentCommencementDate = treatmentCommencementDate;
		this.treatmentEndDate = treatmentEndDate;
	}

	/**
	 * instance variables
	 * 
	 * @Id for primary key attribute
	 * @SequenceGenerator @Generatedvalue to automatically generate id's
	 */

	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "myDbSeq", initialValue = 1)
	@GeneratedValue(generator = "mySeqGen")
	private long id;

	/**
	 * @ManyToOne many treatment plans can be there for a single patient
	 * @JoinColumn where ptDetails contains the value from PatientDetail entity
	 */

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = PatientDetail.class)
	@JoinColumn(name = "tp_pt_id")
	private PatientDetail ptDetail;
	private String testDetails;
	private String packageName;
	private String specialist;
	private double cost;
	private String status;
	private String treatmentCommencementDate;
	private String treatmentEndDate;

}
