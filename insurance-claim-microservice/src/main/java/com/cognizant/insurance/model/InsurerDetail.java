package com.cognizant.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Pratik K, Pratik B, Shubham, Kavya
 * 
 * 		model class for InsurerDetail
 * 
 * 		@Entity indicates Spring Data JPA that it is an entity class for the
 *      application
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter
@Entity
@Table(name = "insurer_detail")
public class InsurerDetail {
	public InsurerDetail()
	{}

	public InsurerDetail(long id, String insurerName, String insurerPackageName, double insuranceAmountLimit,
			int disbursementDuration) {
		super();
		this.id = id;
		this.insurerName = insurerName;
		this.insurerPackageName = insurerPackageName;
		this.insuranceAmountLimit = insuranceAmountLimit;
		this.disbursementDuration = disbursementDuration;
	}
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
	public double getInsuranceAmountLimit() {
		return insuranceAmountLimit;
	}
	public void setInsuranceAmountLimit(double insuranceAmountLimit) {
		this.insuranceAmountLimit = insuranceAmountLimit;
	}
	public int getDisbursementDuration() {
		return disbursementDuration;
	}
	public void setDisbursementDuration(int disbursementDuration) {
		this.disbursementDuration = disbursementDuration;
	}
	/**
	 * instance variables
	 * 
	 * @Id helps in defining the primary key
	 */
	@Id
	private long id;
	private String insurerName;
	private String insurerPackageName;
	private double insuranceAmountLimit;
	private int disbursementDuration;
}
