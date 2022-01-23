package com.juaracoding.HRIS.Reimbursement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class KlaimAsuransi {
	
private WebDriver driver;
	
	public KlaimAsuransi() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(8)")
	private WebElement btnReimbursement;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(1)")
	private WebElement btnKlaimAsuransi;
	
	@FindBy(css = "#content > div.col-md-6 > a")
	private WebElement btnddKlaimAsuransi;
	
	@FindBy(id = "Card_Number")
	private WebElement txtNoKartu;
	
	@FindBy(id = "PIC")
	private WebElement txtNamaTertanggung;
	
	@FindBy(id = "rupiah")
	private WebElement txtNilaiKlaim;
	
	@FindBy(id = "datepicker-autoClose")
	private WebElement btnTglPengajuan;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(4)")
	private WebElement btnpilihTgl;
	
	@FindBy(css = "#content > div.row > div > div > div.panel-body > form > div > input.btn.btn-primary.btn-block")
	private WebElement btnSubmit;
	
	@FindBy(css = "#content > div:nth-child(7) > div > div > div.panel-body > form > div > table > tbody > tr > td:nth-child(1) > div > a > span")
	private WebElement btnUploadDokumen;
	
	@FindBy(id = "file")
	private WebElement btnChooseFile;
	
	@FindBy(css = "#modal_form > div > div > div.modal-footer > input")
	private WebElement btnUploadSubmit;
	
	@FindBy(css = "#content > div:nth-child(8) > div:nth-child(2) > div > input")
	private WebElement btnKirim;
	
	@FindBy(css = "a[class='btn btn-primary']")
	private WebElement btnKembali;
	
	@FindBy(id = "tgl")
	private WebElement btnStartDate;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(4)")
	private WebElement btnPilihStartDate;
	
	@FindBy(id = "tgl2")
	private WebElement btnEndDate;
	
	@FindBy(css = "body > div:nth-child(27) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)")
	private WebElement btnPilihEndDate;
	
	@FindBy(id = "btn-filter")
	private WebElement btnFilter;
	
	@FindBy(id = "btn-reset")
	private WebElement btnReset;
	
	@FindBy(css = "#table_length > label > select")
	private WebElement btnEntries;
	
	@FindBy(css = "#table_length > label > select > option:nth-child(4)")
	private WebElement btn100;
	
	@FindBy(css = "#table_filter > label > input")
	private WebElement txtsearch;
	
	@FindBy(id = "btnSearch")
	private WebElement btnsearch;
	
	public void Reimbursement() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnReimbursement)).click();
		btnKlaimAsuransi.click();
	}
	
	public void addKlaimAsuransi(String nokartu, String PIC, String rupiah) {
		btnddKlaimAsuransi.click();
		txtNoKartu.sendKeys(nokartu);
		txtNamaTertanggung.sendKeys(PIC);
		txtNilaiKlaim.sendKeys(rupiah);
		btnTglPengajuan.click();
		btnpilihTgl.click();
		btnSubmit.click();
	}
	
	public void UploadDokumen() {
		btnUploadDokumen.click();
		btnChooseFile.sendKeys("C:\\Users\\Ferdin Permana Putra\\Pictures\\Wallpaper\\Gambar1.jpg");
		btnUploadSubmit.click();
		btnKirim.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		btnKembali.click();
	}
	
	public void filterreset() {
		btnStartDate.click();
		btnPilihStartDate.click();
		btnEndDate.click();
		btnPilihEndDate.click();
		btnFilter.click();
		btnReset.click();
	}
	
	public void entries() {
		btnEntries.click();
		btn100.click();
	}
	
	public void search(String search) {
		txtsearch.sendKeys(search);
		btnsearch.click();	
	}
}
