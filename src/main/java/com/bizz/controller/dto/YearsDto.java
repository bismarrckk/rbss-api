package com.bizz.controller.dto;

public class YearsDto {
	private int yearId;
	private String financialYear;
	private String currentYear;
	public YearsDto() {
		super();
	}
	public YearsDto(int yearId, String financialYear, String currentYear) {
		super();
		this.yearId = yearId;
		this.financialYear = financialYear;
		this.currentYear = currentYear;
	}
	public int getYearId() {
		return yearId;
	}
	public void setYearId(int yearId) {
		this.yearId = yearId;
	}
	public String getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}
	public String getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}
	
	
}
