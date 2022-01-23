package com.juaracoding.HRIS.RequestStaff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.HRIS.driver.DriverSingleton;

public class Pending {
	
private WebDriver driver;
	
	public Pending() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(12)")
	private WebElement btnRequestStaff;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(1)")
	private WebElement btnPending;
	
	@FindBy(css = "#content > div > div > div > div.panel-body > div.col.row.d-flex.justify-content-between.pr-0.mr-0 > div.row.mt-auto > a")
	private WebElement btnInputData;
	
	//Detail
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(1) > div > select")
	private WebElement btnTujuan;
	
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(1) > div > select > option:nth-child(2)")
	private WebElement btnPilihTujuan;
	
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(4) > div > input")
	private WebElement txtUnit;
	
	@FindBy(id = "ui-id-72")
	private WebElement btnPilihUnit;
	
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(5) > div > input")
	private WebElement txtJmlhOrang;
	
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(6) > div > input")
	private WebElement btnMulaiKerja;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(6) > td:nth-child(2)")
	private WebElement btnPilihTgl;
	
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(7) > div > select")
	private WebElement btnLokasiKerja;
	
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(7) > div > select > option:nth-child(6)")
	private WebElement btnPilihLokasi;
	
	@FindBy(css = "#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(8) > div > textarea")
	private WebElement txtDesKripsiPekerjaan;
	
	//Kualifikasi
	@FindBy(css = "#content > form > div:nth-child(2) > div > div > div.panel-body > div:nth-child(6) > div > select")
	private WebElement btnTambahField;
	
	@FindBy(css = "#content > form > div:nth-child(2) > div > div > div.panel-body > div:nth-child(6) > div > select > option:nth-child(2)")
	private WebElement btnPilihField1;
	
	@FindBy(css = "#field_jk > div > select")
	private WebElement btnJenisKelamin;
	
	@FindBy(css = "#field_jk > div > select > option:nth-child(2)")
	private WebElement btnPilihJenisKelamin;
	
	@FindBy(css = "#content > form > div:nth-child(2) > div > div > div.panel-body > div:nth-child(6) > div > select > option:nth-child(3)")
	private WebElement btnPilihField2;
	
	@FindBy(css = "#field_umur > div > table > tbody > tr > td:nth-child(1) > input")
	private WebElement txtUmur1;
	
	@FindBy(css = "#field_umur > div > table > tbody > tr > td:nth-child(3) > input")
	private WebElement txtUmur2;
	
	@FindBy(css = "#content > form > div:nth-child(2) > div > div > div.panel-body > div:nth-child(6) > div > select > option:nth-child(4)")
	private WebElement btnPilihField3;
	
	@FindBy(css = "#field_pendidikan > div > select")
	private WebElement btnPendidikan;
	
	@FindBy(css = "#field_pendidikan > div > select > option:nth-child(4)")
	private WebElement btnPilihPendidikan;
	
	@FindBy(css = "#content > form > div:nth-child(2) > div > div > div.panel-body > div:nth-child(6) > div > select > option:nth-child(5)")
	private WebElement btnPilihField4;
	
	@FindBy(css = "#field_status_perkawinan > div > select")
	private WebElement btnStatusPerkawinan;
	
	@FindBy(css = "#field_status_perkawinan > div > select > option:nth-child(3)")
	private WebElement btnPilihStatusPerkawinan;
	
	@FindBy(css = "#content > form > div:nth-child(2) > div > div > div.panel-body > div:nth-child(6) > div > select > option:nth-child(6)")
	private WebElement btnPilihField5;
	
	@FindBy(css = "#field_other > div > textarea")
	private WebElement txtKualifikasilainnya;
	
	//Kondisi yang Diusulkan
	@FindBy(css = "input[name='Probation_Period']")
	private WebElement txtMasaPercobaan;
	
	@FindBy(css = "#content > form > div:nth-child(3) > div > div > div.panel-body > div:nth-child(2) > div > select")
	private WebElement btnJabatan;
	
	@FindBy(css = "#content > form > div:nth-child(3) > div > div > div.panel-body > div:nth-child(2) > div > select > option:nth-child(3)")
	private WebElement btnPilihJabatan;
	
	@FindBy(css = "#content > form > div:nth-child(3) > div > div > div.panel-body > div:nth-child(3) > div > input")
	private WebElement txtGaji;
	
	@FindBy(css = "#cbInsurance0")
	private WebElement btnPilihAsuransi1;
	
	@FindBy(css = "#cbInsurance3")
	private WebElement btnPilihAsuransi4;
	
	@FindBy(css = "#cbInsurance1")
	private WebElement btnPilihAsuransi2;
	
	@FindBy(css = "#cbInsurance2")
	private WebElement btnPilihAsuransi3;
	
	@FindBy(css = "#content > form > div:nth-child(3) > div > div > div.panel-body > div:nth-child(5) > div > input")
	private WebElement txtTunjanganJabatan;
	
	@FindBy(css = "#content > form > div:nth-child(3) > div > div > div.panel-body > div:nth-child(6) > div > input")
	private WebElement txtTunjanganTransportasi;
	
	@FindBy(css = "#content > form > div:nth-child(3) > div > div > div.panel-body > div:nth-child(7) > div > input")
	private WebElement txtTunjanganKomunikasi;
	
	@FindBy(id = "Note_Request")
	private WebElement txtNote;
	
	@FindBy(css = "#content > form > button")
	private WebElement btnKirim;
	
	@FindBy(id = "fField")
	private WebElement btnStartDate;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(2)")
	private WebElement btnPilihStartDate;
	
	@FindBy(id = "tField")
	private WebElement btnEndDate;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(6)")
	private WebElement btnPilihEndDate;
	
	@FindBy(id = "btnFilter")
	private WebElement btnFilter;
	
	@FindBy(css = "#dataTable_length > label > select")
	private WebElement btnEntries;
	
	@FindBy(css = "#dataTable_length > label > select > option:nth-child(4)")
	private WebElement btn100;
	
	@FindBy(css = "#dataTable_filter > label > input")
	private WebElement txtsearch;
	
	public void Request() {
		 btnRequestStaff.click();
		 btnPending.click();
	}
	
	public void InputData(String unit, String jmlh, String deskripsipekerjaan, String umur1, String umur2, String lainnya, String masapercobaan,
			String gaji, String tunjangan1, String tunjangan2, String tunjangan3, String notes) {
		btnInputData.click();
		//Detail
		btnTujuan.click();
		btnPilihTujuan.click();
		txtUnit.sendKeys(unit);
		txtJmlhOrang.sendKeys(jmlh);
		btnMulaiKerja.click();
		btnPilihTgl.click();
		btnLokasiKerja.click();
		btnPilihLokasi.click();
		txtDesKripsiPekerjaan.sendKeys(deskripsipekerjaan);
		
		//Kualifikasi
		btnTambahField.click();
		btnPilihField1.click();
		btnJenisKelamin.click();
		btnPilihJenisKelamin.click();
		
		
		//Kondisi yang Diusulkan
		txtMasaPercobaan.sendKeys(masapercobaan);
		btnJabatan.click();
		btnPilihJabatan.click();
		txtGaji.sendKeys(gaji);
		btnPilihAsuransi1.click();
		btnPilihAsuransi2.click();
		btnPilihAsuransi3.click();
		btnPilihAsuransi4.click();
		txtTunjanganJabatan.sendKeys(tunjangan1);
		txtTunjanganTransportasi.sendKeys(tunjangan2);
		txtTunjanganKomunikasi.sendKeys(tunjangan3);
		txtNote.sendKeys(notes);
		btnKirim.click();
	}
	
	public void filterreset() {
		btnStartDate.click();
		btnPilihStartDate.click();
		btnEndDate.click();
		btnFilter.click();
	}
	
	public void entries() {
		btnEntries.click();
		btn100.click();
	}
	
	public void search(String searchTracking) {
		txtsearch.sendKeys(searchTracking);
	}
	
}
