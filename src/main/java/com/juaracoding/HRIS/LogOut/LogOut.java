package com.juaracoding.HRIS.LogOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class LogOut {
	
private WebDriver driver;
	
	public LogOut() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > ul > li.dropdown.navbar-user > a")
	private WebElement btnUser;
	
	@FindBy(css = "#header > ul > li.dropdown.navbar-user.show > div > a")
	private WebElement btnLogOut;

	
	public void Exit() {
		btnUser.click();
		btnLogOut.click();
	}

}
