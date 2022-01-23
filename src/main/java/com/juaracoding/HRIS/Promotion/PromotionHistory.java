package com.juaracoding.HRIS.Promotion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class PromotionHistory {
	
private WebDriver driver;
	
	public PromotionHistory() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(7)")
	private WebElement btnPromotion;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(2)")
	private WebElement btnPromotionHistory;
	
	public void Promotion() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnPromotion)).click();
		btnPromotionHistory.click();
	}

}
