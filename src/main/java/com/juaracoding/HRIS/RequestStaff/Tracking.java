package com.juaracoding.HRIS.RequestStaff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class Tracking {
	
private WebDriver driver;
	
	public  Tracking() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(12)")
	private WebElement btnRequestStaff;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.active > ul > li:nth-child(2) > a")
	private WebElement btnTracking;
	
	@FindBy(id = "fField")
	private WebElement btnStartDate;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(2)")
	private WebElement btnPilihStartDate;
	
	@FindBy(id = "tField")
	private WebElement btnEndDate;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(6)")
	private WebElement btnPilihEndDate;
	
	@FindBy(id = "btnFilter")
	private WebElement btnFilter;
	
	@FindBy(css = "#dataTable_length > label > select")
	private WebElement btnEntries;
	
	@FindBy(css = "#dataTable_length > label > select > option:nth-child(4)")
	private WebElement btn100;
	
	@FindBy(css = "#dataTable_filter > label > input")
	private WebElement txtsearch;
	
	public void Request() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable( btnRequestStaff)).click();
		btnTracking.click();
	}
	
	public void filterreset() {
		btnStartDate.click();
		btnPilihStartDate.click();
		btnEndDate.click();
		btnFilter.click();
	}
	
	public void entries() {
		btnEntries.click();
		btn100.click();
	}
	
	public void search(String searchTracking) {
		txtsearch.sendKeys(searchTracking);
	}

}
