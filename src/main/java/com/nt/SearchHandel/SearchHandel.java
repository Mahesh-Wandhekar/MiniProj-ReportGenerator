package com.nt.SearchHandel;

import java.time.LocalDate;

public class SearchHandel {
	
	private String planName;
	private String planStatus;
	private String gender;
	private String startDate;
	private String endDate;
	
	


	@Override
	public String toString() {
		return "SearchHandel [planName=" + planName + ", planStatus=" + planStatus + ", gender=" + gender
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
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




	public String getStartDate() {
		return startDate;
	}




	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}




	public String getEndDate() {
		return endDate;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}




	public SearchHandel() {
		// TODO Auto-generated constructor stub
	}

}
