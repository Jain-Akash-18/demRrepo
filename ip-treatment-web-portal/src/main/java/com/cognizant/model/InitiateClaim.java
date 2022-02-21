package com.cognizant.model;





import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InitiateClaim {
	

	public InitiateClaim(long id, String specialist, String treatmentCommencementDate, String treatmentEndDate,
			String patientName, String patientStatus, String ailment, String treatmentPackageName, String testDetail,
			String insurerName, String insurerPackageName, int insuranceAmountLimit, int disbursementDuration,
			int treatmentEndDateCost, int treatmentDurationinWeeks, int age, int finalCost) {
		super();
		this.id = id;
		this.specialist = specialist;
		this.treatmentCommencementDate = treatmentCommencementDate;
		this.treatmentEndDate = treatmentEndDate;
		this.patientName = patientName;
		this.patientStatus = patientStatus;
		this.ailment = ailment;
		this.treatmentPackageName = treatmentPackageName;
		this.testDetail = testDetail;
		this.insurerName = insurerName;
		this.insurerPackageName = insurerPackageName;
		this.insuranceAmountLimit = insuranceAmountLimit;
		this.disbursementDuration = disbursementDuration;
		this.treatmentEndDateCost = treatmentEndDateCost;
		this.treatmentDurationinWeeks = treatmentDurationinWeeks;
		this.age = age;
		this.finalCost = finalCost;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
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
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
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
	public String getTestDetail() {
		return testDetail;
	}
	public void setTestDetail(String testDetail) {
		this.testDetail = testDetail;
	}
	public String getInsurerName() {
		return insurerName;
	}
	public void setInsurerName(String insurerName) {
		this.insurerName = insurerName;
	}
	public String getInsurerPackageName() {
		return insurerPackageName;
	}
	public void setInsurerPackageName(String insurerPackageName) {
		this.insurerPackageName = insurerPackageName;
	}
	public int getInsuranceAmountLimit() {
		return insuranceAmountLimit;
	}
	public void setInsuranceAmountLimit(int insuranceAmountLimit) {
		this.insuranceAmountLimit = insuranceAmountLimit;
	}
	public int getDisbursementDuration() {
		return disbursementDuration;
	}
	public void setDisbursementDuration(int disbursementDuration) {
		this.disbursementDuration = disbursementDuration;
	}
	public int getTreatmentEndDateCost() {
		return treatmentEndDateCost;
	}
	public void setTreatmentEndDateCost(int treatmentEndDateCost) {
		this.treatmentEndDateCost = treatmentEndDateCost;
	}
	public int getTreatmentDurationinWeeks() {
		return treatmentDurationinWeeks;
	}
	public void setTreatmentDurationinWeeks(int treatmentDurationinWeeks) {
		this.treatmentDurationinWeeks = treatmentDurationinWeeks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFinalCost() {
		return finalCost;
	}
	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}
	private long id;
	private String specialist;
	private String treatmentCommencementDate;
	private String treatmentEndDate;
	private String patientName;
	private String patientStatus;
	private String ailment;
	private String treatmentPackageName;
	private String testDetail;
	private String insurerName;
	private String insurerPackageName;
	private int insuranceAmountLimit;
	private int disbursementDuration;
	private int treatmentEndDateCost;
	private int treatmentDurationinWeeks;
	private int age;
	private int finalCost;

}

