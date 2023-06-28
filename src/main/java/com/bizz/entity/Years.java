package com.bizz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="years")
public class Years {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int yearId;
	private String financialYear;
	private String currentYear;
	public Years() {
		super();
	}
	public Years(int yearId, String financialYear, String currentYear) {
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
