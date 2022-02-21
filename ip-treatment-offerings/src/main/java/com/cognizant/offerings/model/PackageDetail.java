package com.cognizant.offerings.model;

import javax.persistence.Embeddable;

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
@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PackageDetail {

	/**
	 * instance variables
	 */
	private String treatmentPackageName;
	public PackageDetail() {
		super();
	}
	private String testDetails;
	private int cost;
	private int treatmentDurationInWeeks;
	public PackageDetail(String treatmentPackageName, String testDetails, int cost, int treatmentDurationInWeeks) {
		super();
		this.treatmentPackageName = treatmentPackageName;
		this.testDetails = testDetails;
		this.cost = cost;
		this.treatmentDurationInWeeks = treatmentDurationInWeeks;
	}
	public String getTreatmentPackageName() {
		return treatmentPackageName;
	}
	public void setTreatmentPackageName(String treatmentPackageName) {
		this.treatmentPackageName = treatmentPackageName;
	}
	public String getTestDetails() {
		return testDetails;
	}
	public void setTestDetails(String testDetails) {
		this.testDetails = testDetails;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTreatmentDurationInWeeks() {
		return treatmentDurationInWeeks;
	}
	public void setTreatmentDurationInWeeks(int treatmentDurationInWeeks) {
		this.treatmentDurationInWeeks = treatmentDurationInWeeks;
	}
	
	
	
}
