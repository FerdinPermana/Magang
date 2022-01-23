package com.juaracoding.HRIS.Data;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class PengajuanCuti {

private WebDriver driver;
	
	public PengajuanCuti() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > ul > li:nth-child(3)")
	private WebElement btnPerngajuanCuti;
	
	@FindBy(css = "#toggleForm")
	private WebElement btnaddformcuti;
	
	@FindBy(id = "type")
	private WebElement btnType;
	
	@FindBy(css = "#type > option:nth-child(2)")
	private WebElement btnAnnual;
	
	@FindBy(id = "leave_periode")
	private WebElement btnTglCuti;
	
	@FindBy(css = "body > div.daterangepicker.ltr.show-calendar.opensright > div.drp-calendar.left > div.calendar-table > table > tbody > tr:nth-child(5) > td:nth-child(3)")
	private WebElement btnStartDate;
	
	@FindBy(css = "body > div.daterangepicker.ltr.show-calendar.opensright > div.drp-calendar.left > div.calendar-table > table > tbody > tr:nth-child(5) > td:nth-child(4)")
	private WebElement btnEndDate;
	
	@FindBy(css = "body > div.daterangepicker.ltr.show-calendar.opensright > div.drp-buttons > button.applyBtn.btn.btn-sm.btn-primary")
	private WebElement btnApply;
	
	@FindBy(id = "notes")
	private WebElement txtNotes;
	
	@FindBy(css = "#btnSubmit")
	private WebElement btnSubmit;
	
	@FindBy(css = "#content > div:nth-child(6) > div > div > div.panel-body > div.alert.alert-danger.fade.show")
	private WebElement txtMessage;
	
	public void Data() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnPerngajuanCuti)).click();
	}
	
	public void AddFormCuti(String notes) {	
		JavascriptExecutor ts = (JavascriptExecutor) driver;
		ts.executeScript("window.scrollBy(0,1000)");
		btnaddformcuti.click();
		btnType.click();;
		btnAnnual.click();
		btnTglCuti.click();
		btnStartDate.click();
		btnEndDate.click();
		btnApply.click();
		txtNotes.sendKeys(notes);
		btnSubmit.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		txtMessage.getText();
	}
}
