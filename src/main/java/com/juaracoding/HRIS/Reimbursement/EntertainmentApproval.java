package com.juaracoding.HRIS.Reimbursement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class EntertainmentApproval {

private WebDriver driver;
	
	public EntertainmentApproval() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(8)")
	private WebElement btnReimbursement;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(5)")
	private WebElement btnEntertainmentApproval;
	
	public void Reimbursement() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnReimbursement)).click();
		btnEntertainmentApproval.click();
	}
}
