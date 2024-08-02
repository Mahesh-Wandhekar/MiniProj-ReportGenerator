package com.nt.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Citizen_info")
public class CitizenData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private Double BenifitAmount;
	private String DenialReason;
	private LocalDate TerminatedDate;
	private String TerminatedReason;
	
	
	

	public Integer getCitizenId() {
		return citizenId;
	}




	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}




	public String getCitizenName() {
		return citizenName;
	}




	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getPlanName() {
		return planName;
	}




	public void setPlanName(String planName) {
		this.planName = planName;
	}




	public String getPlanStatus() {
		return planStatus;
	}




	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}




	public LocalDate getStartDate() {
		return startDate;
	}




	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}




	public LocalDate getEndDate() {
		return endDate;
	}




	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}




	public Double getBenifitAmount() {
		return BenifitAmount;
	}




	public void setBenifitAmount(Double benifitAmount) {
		BenifitAmount = benifitAmount;
	}




	public String getDenialReason() {
		return DenialReason;
	}




	public void setDenialReason(String denialReason) {
		DenialReason = denialReason;
	}




	public LocalDate getTerminatedDate() {
		return TerminatedDate;
	}




	public void setTerminatedDate(LocalDate terminatedDate) {
		TerminatedDate = terminatedDate;
	}




	public String getTerminatedReason() {
		return TerminatedReason;
	}




	public void setTerminatedReason(String terminatedReason) {
		TerminatedReason = terminatedReason;
	}




	public CitizenData() {
		// TODO Auto-generated constructor stub
	}

}
