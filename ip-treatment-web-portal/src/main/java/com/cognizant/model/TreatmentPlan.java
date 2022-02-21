package com.cognizant.model;

import lombok.Data;

/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		model class for Treatment Plan of a Patient
 * 
 * 
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */
@Data
public class TreatmentPlan {
	

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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
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
			int cost, String status, String treatmentCommencementDate, String treatmentEndDate) {
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
	private long id;
	private PatientDetail ptDetail;		//added
	private String testDetails;			//changed
	private String packageName;			//changed 
	private String specialist;	
	private int cost;
	private String status;
	private String treatmentCommencementDate;
	private String treatmentEndDate;

}
