package com.juaracoding.HRIS.Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class PengajuanResign {
	
private WebDriver driver;
	
	public PengajuanResign() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > ul > li:nth-child(5)")
	private WebElement btnPengajuanResign;
	
	// Add Request Resign
	@FindBy(css = "#content > div.col-lg-12 > h1 > a")
	private WebElement btnaddPengajuanResign;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(2) > div.panel-body > div > div:nth-child(1) > div > div > div:nth-child(1) > label")
	private WebElement btnAlasan;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(2) > div.panel-body > div > div:nth-child(2) > div:nth-child(1) > div > input")
	private WebElement txtTglResign;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(2) > div.panel-body > div > div:nth-child(2) > div:nth-child(2) > select")
	private WebElement btnBersedia;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(2) > div.panel-body > div > div:nth-child(2) > div:nth-child(2) > select > option:nth-child(2)")
	private WebElement btnPilihBersedia;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(1) > textarea")
	private WebElement txtQuestionare1;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(2) > textarea")
	private WebElement txtQuestionare2;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(3) > textarea")
	private WebElement txtQuestionare3;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(4) > textarea")
	private WebElement txtQuestionare4;
	
	@FindBy(css = "#content > div:nth-child(3) > div > form > div.box-footer > button")
	private WebElement btnSubmit;
	
	public void Data() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnPengajuanResign)).click();
	}
	
	public void addRequestResign(String Tgl, String Questioner) {
		btnaddPengajuanResign.click();		
		btnAlasan.click();
		txtTglResign.sendKeys(Tgl);
		btnBersedia.click();
		btnPilihBersedia.click();
		txtQuestionare1.sendKeys(Questioner);
		txtQuestionare2.sendKeys(Questioner);
		txtQuestionare3.sendKeys(Questioner);
		txtQuestionare4.sendKeys(Questioner);
		btnSubmit.click();
	}

}
