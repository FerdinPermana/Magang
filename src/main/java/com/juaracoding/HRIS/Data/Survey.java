package com.juaracoding.HRIS.Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class Survey {

private WebDriver driver;
	
	public Survey() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3)")
	private WebElement btnData;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(6) > a")
	private WebElement btnSurvey;
	
	@FindBy(css = "#data-request > tbody > tr.odd > td:nth-child(3) > a")
	private WebElement btnSurveyView;
	
	public void Data() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnData)).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnSurvey.click();
		btnSurveyView.click();
	}
}
