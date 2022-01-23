package com.juaracoding.HRIS.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class SlipGaji {

private WebDriver driver;
	
	public SlipGaji() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3)")
	private WebElement btnData;
	
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(2)> a")
	private WebElement btnSlipGaji;
	
	@FindBy(css = "#content > div > div > div > form > div.col-10.pl-0 > select")
	private WebElement btnSelectPeriode;
	
	public void Data() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnData)).click();
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnSlipGaji)).click();
		btnSelectPeriode.click();
	}
}
