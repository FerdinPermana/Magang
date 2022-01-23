package com.juaracoding.HRIS.Promotion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class Promotion {
	
private WebDriver driver;
	
	public Promotion() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(7)")
	private WebElement btnPromotionMenu;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(1)")
	private WebElement btnPromotion1;
	
	@FindBy(css = "#content > div.col-md-6 > a")
	private WebElement btnddData;
	
	@FindBy(css = "#cb_promotion_0")
	private WebElement btnTujuanPromosi1;
	
	@FindBy(css = "#cb_promotion_1")
	private WebElement btnTujuanPromosi2;
	
	@FindBy(css = "#cb_promotion_2")
	private WebElement btnTujuanPromosi3;
	
	@FindBy(css = "#nik > option:nth-child(2)")
	private WebElement btnNIK;
	
	@FindBy(id = "Current_Salary")
	private WebElement txtGajiPokok;
	
	@FindBy(id = "Current_Communication_Allowance")
	private WebElement txtTunjanganKomunikasi;
	
	@FindBy(id = "Current_Positional_Allowance")
	private WebElement txtTunjanganJabatan;
	
	@FindBy(id = "Current_Transportation_Allowance")
	private WebElement txtTunjanganTransportasi;
	
	@FindBy(id="Effective_Date")
	private WebElement txtTanggalEfektif;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(2) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian1;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(3) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian2;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(4) > td:nth-child(6) > input[type=radio]")
	private WebElement btnPenilian3;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(5) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian4;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(6) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian5;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(7) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian6;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(8) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian7;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(9) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian8;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(10) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian9;
	
	@FindBy(css = "#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(11) > td:nth-child(7) > input[type=radio]")
	private WebElement btnPenilian10;
	
	@FindBy(id = "Aspect1")
	private WebElement txtAspekKelebihan;
	
	@FindBy(id = "Aspect2")
	private WebElement txtAspekDitingkatkan;
	
	@FindBy(id = "Aspect3")
	private WebElement txtAsuransiygDiberikan;
	
	@FindBy(css = "#Aspect4 > option:nth-child(2)")
	private WebElement btnUlasanAtasan;
	
	@FindBy(css = "#div_comment > div > div > div.panel-body > div > div > div > div > div:nth-child(1) > select > option:nth-child(3)")
	private WebElement btnVaksinCovid;
	
	@FindBy(id = "Requested_Comment")
	private WebElement txtNote;
	
	@FindBy(css = "#content > form > input.btn.btn-lg.btn-block.btn-primary")
	private WebElement btnSend;
	
	
	public void Promotion() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnPromotionMenu)).click();
		btnPromotion1.click();
	}
	
	public void AddData(String GajiPokok, String Tunjangan1, String Tunjangan2, String Tunjangan3, String TglEfektif,
		String Aspek1, String Aspek2, String Asuransi, String notepromotion) {
		btnddData.click();
		btnTujuanPromosi1.click();
		btnTujuanPromosi2.click();
		btnTujuanPromosi3.click();
		btnNIK.click();
		txtGajiPokok.sendKeys(GajiPokok);
		txtTunjanganKomunikasi.sendKeys(Tunjangan1);
		txtTunjanganJabatan.sendKeys(Tunjangan2);
		txtTunjanganTransportasi.sendKeys(Tunjangan3);
		txtTanggalEfektif.sendKeys(TglEfektif);
		btnPenilian1.click();
		btnPenilian2.click();
		btnPenilian3.click();
		btnPenilian4.click();
		btnPenilian5.click();
		btnPenilian6.click();
		btnPenilian7.click();
		btnPenilian8.click();
		btnPenilian9.click();
		btnPenilian10.click();
		txtAspekKelebihan.sendKeys(Aspek1);
		txtAspekDitingkatkan.sendKeys(Aspek2);
		txtAsuransiygDiberikan.sendKeys(Asuransi);
		btnUlasanAtasan.click();
		btnVaksinCovid.click();
		txtNote.sendKeys(notepromotion);
		btnSend.click();
	}
	

}
