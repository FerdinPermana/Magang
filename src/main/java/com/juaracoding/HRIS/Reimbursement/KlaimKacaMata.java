package com.juaracoding.HRIS.Reimbursement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class KlaimKacaMata {

private WebDriver driver;
	
	public KlaimKacaMata() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(8)")
	private WebElement btnReimbursement;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(2)")
	private WebElement btnKlaimkacamata;
	
	//Add Klaim
	@FindBy(css = "#content > div.col-md-6 > a")
	private WebElement btnAddKlaimKacamata;
	
	@FindBy(id = "Card_Number")
	private WebElement txtNoKartu;
	
	@FindBy(id = "PIC")
	private WebElement txtPIC;
	
	@FindBy(id = "rupiah")
	private WebElement txtNilaiKlaim;
	
	@FindBy(id = "tgl")
	private WebElement btnTglPengajuan;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(6) > td:nth-child(2)")
	private WebElement btnPilihTgl;
	
	@FindBy(css = "#form > div > input.btn.btn-primary.btn-block")
	private WebElement btnSubmit;
	
	//Upload Dokumen
	@FindBy(css = "#content > div:nth-child(7) > div > div > div.panel-body > form > div > table > tbody > tr > td:nth-child(1) > div > a > span")
	private WebElement btnUploadDokumen;
	
	@FindBy(id = "file")
	private WebElement btnChooseFile;
	
	@FindBy(css = "#modal_form > div > div > div.modal-footer > input")
	private WebElement btnUploadSubmit;
	
	@FindBy(css = "input[value='Kirim']")
	private WebElement btnKirim;
	
	@FindBy(css = "#content > div:nth-child(9) > div:nth-child(2) > div > div > a")
	private WebElement btnKembali;
	
	//Filter
	@FindBy(id = "tgl")
	private WebElement btnStartDate;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(2)")
	private WebElement btnPilihStartDate;
	
	@FindBy(id = "tgl2")
	private WebElement btnEndDate;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(5)")
	private WebElement btnPilihEndDate;
	
	@FindBy(id = "btn-filter")
	private WebElement btnFilter;
	
	@FindBy(id = "btn-reset")
	private WebElement btnReset;
	
	//Entries
	@FindBy(css = "#table_length > label > select")
	private WebElement btnEntries;
	
	@FindBy(css = "#table_length > label > select > option:nth-child(4)")
	private WebElement btn100;
	
	//Search
	@FindBy(css = "#table_filter > label > input")
	private WebElement txtsearch;
	
	@FindBy(id = "btnSearch")
	private WebElement btnsearch;
	
	public void Reimbursement() {
		new WebDriverWait(driver, 500).until(ExpectedConditions.elementToBeClickable(btnReimbursement)).click();
		btnKlaimkacamata.click();
	}
	
	public void addKlaimKacamata(String nokartu, String PIC, String rupiah) {
		btnAddKlaimKacamata.click();
		txtNoKartu.sendKeys(nokartu);
		txtPIC.sendKeys(PIC);
		txtNilaiKlaim.sendKeys(rupiah);
		btnTglPengajuan.click();
		btnPilihTgl.click();
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
