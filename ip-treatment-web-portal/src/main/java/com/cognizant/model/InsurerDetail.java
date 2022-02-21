package com.cognizant.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		model class for Insurer Details
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

public class InsurerDetail {

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public InsurerDetail(long id, String insurerName, String insurerPackageName, int insuranceAmountLimit,
			int disbursementDuration) {
		super();
		this.id = id;
		this.insurerName = insurerName;
		this.insurerPackageName = insurerPackageName;
		this.insuranceAmountLimit = insuranceAmountLimit;
		this.disbursementDuration = disbursementDuration;
	}

	private long id;
	private String insurerName;
	private String insurerPackageName;
	private int insuranceAmountLimit;
	private int disbursementDuration;
	
	@Override
	public String toString() {
		return "InsurerDetail [id=" + id + ", insurerName=" + insurerName + ", insurerPackageName=" + insurerPackageName
				+ ", insuranceAmountLimit=" + insuranceAmountLimit + ", disbursementDuration=" + disbursementDuration
				+ "]";
	}
}
