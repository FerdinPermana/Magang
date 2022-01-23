package com.juaracoding.HRIS.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.juaracoding.HRIS.driver.DriverSingleton;

public class PersetujuanCuti {

private WebDriver driver;
	
	public PersetujuanCuti() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > ul > li:nth-child(4)")
	private WebElement btnPersetujunCuti;
	
	public  void Data() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnPersetujunCuti)).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
