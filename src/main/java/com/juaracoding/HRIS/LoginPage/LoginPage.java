package com.juaracoding.HRIS.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#page-container > div > div.login-content > form > div:nth-child(1) > input")
	private WebElement txtUsername;
	
	@FindBy(css = "#page-container > div > div.login-content > form > div:nth-child(2) > input")
	private WebElement txtPassword;
	
	@FindBy(css = "#page-container > div > div.login-content > form > div.login-buttons")
	private WebElement btnLogin;
	
	
	public void goToLogin() {
		btnLogin.click();
	}
	
	public void goToLoggedIn(String username, String password) {		
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
	}
}
