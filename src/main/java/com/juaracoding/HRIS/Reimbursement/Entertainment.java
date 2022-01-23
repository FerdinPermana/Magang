package com.juaracoding.HRIS.Reimbursement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class Entertainment {

private WebDriver driver;
	
	public Entertainment() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(8)")
	private WebElement btnReimbursement;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(4)")
	private WebElement btnEntertainment;
	
	//Add New
	@FindBy(css = "#content > div:nth-child(2) > div > div > a")
	private WebElement btnAddNew;
	
	@FindBy(id = "bank_name")
	private WebElement btnBank;
	
	@FindBy(css = "#bank_name > option:nth-child(2)")
	private WebElement btnBankBCA;
	
	@FindBy(id = "bank_account")
	private WebElement txtNoRekening;
	
	@FindBy(id = "division")
	private WebElement btnDivisi;
	
	@FindBy(css = "#division > option:nth-child(4)")
	private WebElement btnPilihDivisi;
	
	@FindBy(id = "request_date")
	private WebElement btnTglPengajuan;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(6)")
	private WebElement btnPilihTgl;
	
	@FindBy(id = "branch")
	private WebElement btnCabang;
	
	@FindBy(css = "#branch > option:nth-child(18)")
	private WebElement btnPilihCabang;
	
	@FindBy(id = "claim_value")
	private WebElement txtNilaiKlaim;
	
	@FindBy(css = "#content > div.row > div > div > div.panel-body > form > div > button")
	private WebElement btnSubmit;
	
	//PemberiSumbangan
	@FindBy(id = "place")
	private WebElement txtTempat;
	
	@FindBy(id = "address")
	private WebElement txtAlamat;
	
	@FindBy(id = "staff")
	private WebElement txtStaffHadir;
	
	@FindBy(id = "claim_value")
	private WebElement txtJmlKlaim;
	
	@FindBy(css = "#materai > option:nth-child(2)")
	private WebElement btnMaterai;
	
	@FindBy(id = "relation_name")
	private WebElement txtNama;
	
	@FindBy(id = "relation_position")
	private WebElement txtJabatanUsaha;
	
	@FindBy(id = "relation_company_name")
	private WebElement txtNamaPerusahaan;
	
	@FindBy(id = "relation_staff")
	private WebElement txtStaffYangHadir;
	
	@FindBy(css = "#entertainment_type > option:nth-child(5)")
	private WebElement btnJenisEntertainment;
	
	@FindBy(css = "#position_of_company_relation > option:nth-child(4)")
	private WebElement btnPosisiRelasi;
	
	@FindBy(css = "#company_type > option:nth-child(9)")
	private WebElement btnJenisUsaha;
	
	@FindBy(css = "#entertaiment_purpose > option:nth-child(11)")
	private WebElement btnTujuanEntertainment;
	
	@FindBy(id = "btnSaveDetail")
	private WebElement btnSaveDetail;
	
	//Upload Dokumen
	@FindBy(css = "body > div:nth-child(5) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > button:nth-child(4)")
	private WebElement btnUploadDokumen;
	
	@FindBy(id = "userfile")
	private WebElement btnChooseFile;
	
	@FindBy(id="btnUploadDocument")
	private WebElement btnUpload;
	
	@FindBy(id = "btnSubmitForm")
	private WebElement btnSubmitForm;
	
	//Filter
	@FindBy(id = "tgl")
	private WebElement btnStartDate;
		
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(4) > td:nth-child(2)")
	private WebElement btnPilihStartDate;
	
	@FindBy(id = "tgl2")
	private WebElement btnEndDate;
	
	@FindBy(css = "body > div:nth-child(27) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)")
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
		btnEntertainment.click();
	}
	
	public void addnew(String NoRekening, String NilaiKlaim) {
		btnAddNew.click();
		btnBank.click();
		btnBankBCA.click();
		txtNoRekening.sendKeys(NoRekening);
		btnDivisi.click();
		btnTglPengajuan.click();
		btnPilihTgl.click();
		btnCabang.click();
		txtNilaiKlaim.sendKeys(NilaiKlaim);
		btnSubmit.click();
	}
	
	public void PemberiSumbangan(String Tempat, String Alamat, String StaffHadir, String JmlhKlaim,
			String Nama, String JabatanUsaha, String NamaPerusahaan, String StaffygHadir) {
		 txtTempat.sendKeys(Tempat);
		 txtAlamat.sendKeys(Alamat);
		 txtStaffHadir.sendKeys(StaffHadir);
		 txtJmlKlaim.sendKeys(JmlhKlaim);
		 btnMaterai.click();
		 txtNama.sendKeys(Nama);
		 txtJabatanUsaha.sendKeys(JabatanUsaha);
		 txtNamaPerusahaan.sendKeys(NamaPerusahaan);
		 txtStaffYangHadir.sendKeys(StaffygHadir);
		 btnJenisEntertainment.click();
		 btnPosisiRelasi.click();
		 btnJenisUsaha.click();
		 btnTujuanEntertainment.click();
		 btnSaveDetail.click();
	}
	
	public void UploadDokumen() {
		btnUploadDokumen.click();
		btnChooseFile.sendKeys("C:\\Users\\Ferdin Permana Putra\\Pictures\\Wallpaper\\Gambar2.jpg");
		btnUpload.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnSubmitForm.click();
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
