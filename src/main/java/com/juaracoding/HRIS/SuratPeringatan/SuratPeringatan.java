package com.juaracoding.HRIS.SuratPeringatan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class SuratPeringatan {
	
private WebDriver driver;
	
	public SuratPeringatan() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2)")
	private WebElement btnHome;
	
	@FindBy(css = "#content > div > div > div > div.widget-list.rounded.mb-4 > a:nth-child(6) > div.widget-list-content")
	private WebElement btnSuratPeringatan;

	
	public void Teguran() {
		btnHome.click();
		btnSuratPeringatan.click();
	}

}
