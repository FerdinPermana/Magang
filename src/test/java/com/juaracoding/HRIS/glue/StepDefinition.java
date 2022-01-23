package com.juaracoding.HRIS.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.HRIS.Data.PengajuanCuti;
import com.juaracoding.HRIS.Data.PengajuanResign;
import com.juaracoding.HRIS.Data.PersetujuanCuti;
import com.juaracoding.HRIS.Data.SlipGaji;
import com.juaracoding.HRIS.Data.Survey;
import com.juaracoding.HRIS.Data.TandaTanganDigital;
import com.juaracoding.HRIS.LogOut.LogOut;
import com.juaracoding.HRIS.LoginPage.LoginPage;
import com.juaracoding.HRIS.Promotion.Promotion;
import com.juaracoding.HRIS.Promotion.PromotionHistory;
import com.juaracoding.HRIS.Reimbursement.ApprovalKlaimKacaMata;
import com.juaracoding.HRIS.Reimbursement.Entertainment;
import com.juaracoding.HRIS.Reimbursement.EntertainmentApproval;
import com.juaracoding.HRIS.Reimbursement.KlaimAsuransi;
import com.juaracoding.HRIS.Reimbursement.KlaimKacaMata;
import com.juaracoding.HRIS.RequestStaff.Pending;
import com.juaracoding.HRIS.RequestStaff.Tracking;
import com.juaracoding.HRIS.SuratPeringatan.SuratPeringatan;
import com.juaracoding.HRIS.config.AutomationFrameworkConfiguration;
import com.juaracoding.HRIS.driver.DriverSingleton;
import com.juaracoding.HRIS.utils.ConfigurationProperties;
import com.juaracoding.HRIS.utils.Constants;
import com.juaracoding.HRIS.utils.TestCases;
import com.juaracoding.HRIS.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private LoginPage loginPage;
	private SlipGaji slipgaji;
	private PersetujuanCuti persetujuancuti;
	private PengajuanCuti pengajuancuti;
	private PengajuanResign pengajuanResign;
	private Survey survey;
	private TandaTanganDigital Tandattangan;
	private KlaimAsuransi klaimasuransi;
	private KlaimKacaMata klaimkacamata;
	private ApprovalKlaimKacaMata Approvalkacamata;
	private Entertainment entertainment;
	private EntertainmentApproval entertainmentApproval;
	private Promotion promotion;
	private PromotionHistory promotionHistory;
	private Pending pending;
	private Tracking tracking;
	private SuratPeringatan suratPeringatan;
	private LogOut logOut;
	
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		slipgaji = new SlipGaji();
		persetujuancuti = new PersetujuanCuti();
		pengajuancuti = new PengajuanCuti();
		pengajuanResign = new PengajuanResign();
		survey = new Survey();
		Tandattangan = new TandaTanganDigital();
		klaimasuransi = new KlaimAsuransi();
		klaimkacamata = new KlaimKacaMata();
		Approvalkacamata = new ApprovalKlaimKacaMata();
		entertainment = new Entertainment();
		entertainmentApproval = new EntertainmentApproval();
		promotion = new Promotion();
		promotionHistory = new PromotionHistory();
		pending = new Pending();
		tracking = new Tracking();
		suratPeringatan = new SuratPeringatan();
		logOut = new LogOut();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	//Login
	@When("^User input username password and click Login")
	public void User_input_username_password_and_click_Login() {
		loginPage.goToLoggedIn(configurationProperties.getEmail(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username password and click Login");
	}
	
	@Then("^User click Login")
	public void User_click_Login() {
		loginPage.goToLogin();
		extentTest.log(LogStatus.PASS, "User click Login button");
	}
	
	//Data
	@When("^User click Slip Gaji")
	public void User_click_Slip_Gaji() {
		slipgaji.Data();
		extentTest.log(LogStatus.PASS, "User click Slip Gaji");
	}
	
	@When("^User click Pengajuan Cuti")
	public void User_click_Pengajuan_Cuti() {
		pengajuancuti.Data();
		extentTest.log(LogStatus.PASS, "User click Pengajuan Data");
	}
	
	@Then("^User click Add Form Cuti dan User click Submit")
	public void User_click_Add_Form_Cuti_dan_User_click_Submit() {
		pengajuancuti.AddFormCuti(configurationProperties.getNotes());
		extentTest.log(LogStatus.PASS, "User click Add Form Cuti");
	}
	
	@When("^User click Persetujuan Cuti")
	public void User_click_Persetujuan_Cuti() {
		persetujuancuti.Data();
		extentTest.log(LogStatus.PASS, "User click Persetujuan Cuti");
	}
	
	@When("^User click Pengajuan Resign")
	public void User_click_Pengajuan_Resign() {
		pengajuanResign.Data();
		extentTest.log(LogStatus.PASS, "User click Pengajuan Resign");
	}
	
	@Then("^User click Add Pengajuan Resign and Submit")
	public void User_click_Add_Pengajuan_Resign_and_Submit() {
		pengajuanResign.addRequestResign(configurationProperties.getTanggalResign(), configurationProperties.getQuestioner());
		extentTest.log(LogStatus.PASS, "User click Add Pengajuan Resign and Submit");
	}
	
	@When("^User click Survey and click View")
	public void User_click_Survey_and_click_View() {
		survey.Data();
		extentTest.log(LogStatus.PASS, "User click Survey and click View");
	}
	
	@When("^User click Tanda Tangan Digital Canva and simpan")
	public void User_click_Tanda_Tangan_Digital_Canva_and_simpan() {
		Tandattangan.Data();
		extentTest.log(LogStatus.PASS, "User click Tanda Tangan Digital Canva and simpan");
	}
	
	//Reimbersement
	@When("^User click Klaim Asuransi")
	public void User_click_Klaim_Asuransi() {
		klaimasuransi.Reimbursement();
		extentTest.log(LogStatus.PASS, "User click Klaim Asuransi");
	}
	
	@When("^User add Klaim Asuransi")
	public void User_add_Klaim_Asuransi() {
		klaimasuransi.addKlaimAsuransi(configurationProperties.getNokartu(), configurationProperties.getNamaPIC(), configurationProperties.getNilaiklaim());
		extentTest.log(LogStatus.PASS, "User click Add Klaim Asuransi");
	}
	
	@When("^User Upload Dokumen dan kirim Asuransi")
	public void User_Upload_Dokumen_dan_kirim_Asuransi() {
		klaimasuransi.UploadDokumen();
		extentTest.log(LogStatus.PASS, "User Upload dan kirim mendapatkan Message  Data Berhasil Dikirim! Silahkan Menunggu Approval Dari Leader ");
	}
	
	@When("^User filter dan reset table Asuransi")
	public void User_filter_dan_reset_table_Asuransi() {
		klaimasuransi.filterreset();
		extentTest.log(LogStatus.FAIL, "User Fail filter dan reset table");
	}
	
	@When("^User show entries 100 Asuransi")
	public void User_show_entries_100_Asuransi() {
		klaimasuransi.entries();
		extentTest.log(LogStatus.PASS, "User show entries 100");
	}
	
	@Then("^User searches by date Asuransi")
	public void User_searches_by_date_Asuransi() {
		klaimasuransi.search(configurationProperties.getSearch());
		extentTest.log(LogStatus.FAIL, "User Fail searches by date");
	}
	
	@When("^User click Klaim Kacamata")
	public void User_click_Klaim_Kacamata() {
		klaimkacamata.Reimbursement();
		extentTest.log(LogStatus.PASS, "User click Klaim Kacamata");
	}
	
	@When("^User add Klaim Kacamata")
	public void User_add_Klaim_Kacamata() {
		klaimkacamata.addKlaimKacamata(configurationProperties.getNokartu(), configurationProperties.getNamaPIC(), configurationProperties.getNilaiklaim());
		extentTest.log(LogStatus.PASS, "User click Add Klaim Kacamata");
	}
	
	@When("^User Upload Dokumen dan kirim Kacamata")
	public void User_Upload_Dokumen_dan_kirim_Kacamata() {
		klaimkacamata.UploadDokumen();
		extentTest.log(LogStatus.PASS, "User Upload Dokumen dan kirim Kacamata");
	}
	
	@When("^User filter dan reset table Kacamata")
	public void User_filter_dan_reset_table_Kacamata() {
		klaimkacamata.filterreset();
		extentTest.log(LogStatus.FAIL, "User Fail filter dan reset table");
	}
	
	@When("^User show entries 100 Kacamata")
	public void User_show_entries_100_Kacamata() {
		klaimkacamata.entries();
		extentTest.log(LogStatus.PASS, "User show entries 100");
	}
	
	@Then("^User searches by date Kacamata")
	public void User_searches_by_date_Kacamata() {
		klaimkacamata.search(configurationProperties.getSearch());
		extentTest.log(LogStatus.FAIL, "User Fail searches by date");
	}
	
	@When("^User click Approval Klaim Kacamata")
	public void User_click_Approval_Klaim_Kacamata() {
		Approvalkacamata.Reimbursement();
		extentTest.log(LogStatus.PASS, "User click Approval Klaim Kacamata");
	}
	
	//Entertainment
	@When("^User click Entertainment")
	public void User_click_Entertainment() {
		entertainment.Reimbursement();
		extentTest.log(LogStatus.PASS, "User click Entertainment");
	}
	
	@When("^User Add new Entertainment")
	public void User_Add_new_Entertainment() {
		entertainment.addnew(configurationProperties.getNoRekening(), configurationProperties.getNilaiklaim());
		extentTest.log(LogStatus.PASS, "User Add new Entertainment");
	}
	
	@When("^User Input Pemberisumbangan")
	public void User_Input_Pemberisumbangan() {
		entertainment.PemberiSumbangan(configurationProperties.getTempat(), configurationProperties.getAlamat(), configurationProperties.getStaffHadir(), configurationProperties.getJmlhKlaim(),
		configurationProperties.getNama(), configurationProperties.getJabatanUsaha(), configurationProperties.getNamaPerusahaan(), configurationProperties.getStaffygHadir());
		extentTest.log(LogStatus.PASS, "User Input Pemberisumbangan");
	}
	
	@When("^User Upload Dokumen dan kirim Entertainment")
	public void User_Upload_Dokumen_dan_kirim_Entertainment() {
		entertainment.UploadDokumen();
		extentTest.log(LogStatus.PASS, "User Upload Dokumen dan kirim Entertainment");
	}
	
	@When("^User filter dan reset table")
	public void User_filter_dan_reset_table() {
		entertainment.filterreset();
		extentTest.log(LogStatus.PASS, "User filter dan reset table");
	}
	
	@When("^User show entries 100")
	public void User_show_entries_100() {
		entertainment.entries();
		extentTest.log(LogStatus.PASS, "User show entries 100");
	}
	
	@Then("^User searches by date")
	public void User_searches_by_date() {
		entertainment.search(configurationProperties.getSearch());
		extentTest.log(LogStatus.PASS, "User searches by date");
	}
	
	@When("^User click Entertainment Approval")
	public void User_click_Entertainment_Approval() {
		entertainmentApproval.Reimbursement();
		extentTest.log(LogStatus.PASS, "User click Entertainment Approval");
	}
	
	@When("^User click Promotion")
	public void User_click_Promotion() {
		promotion.Promotion();
		extentTest.log(LogStatus.PASS, "User click Promotion");
	}
	
	@Then("^User AddData Promotion and click Send to Upliner")
	public void User_AddData_Promotion_and_click_Send_to_Upliner() {
		promotion.AddData(configurationProperties.getGajiPokok(), configurationProperties.getTunjangan1(), configurationProperties.getTunajngan2(),
		configurationProperties.getTunjangan3(), configurationProperties.getTglEfektif(), configurationProperties.getAspek1(), configurationProperties.getAspek2(), configurationProperties.getAspek3(), configurationProperties.getNotepromotion());
		extentTest.log(LogStatus.PASS, "User click Promotion");
	}
	
	@When("^User click Promotion History")
	public void User_click_Promotion_History() {
		promotionHistory.Promotion();
		extentTest.log(LogStatus.PASS, "User click Promotion History");
	}
	
	@When("^User click Pending")
	public void User_click_Pending() {
		pending.Request();
		extentTest.log(LogStatus.PASS, "User click Pending");
	}
	
	
	@When("^User Input Data  and click Kirim")
	public void User_Input_Data_and_click_Kirim() {
		pending.InputData(configurationProperties.getUnit(), configurationProperties.getJmlhorang(), configurationProperties.getDeskripsipekerjaan(), configurationProperties.getUmur1(), configurationProperties.getUmur2(), configurationProperties.getLainnya(),
		configurationProperties.getMasapercobaan(), configurationProperties.getGaji(), configurationProperties.getTunjangan1(), configurationProperties.getTunajngan2(),
		configurationProperties.getTunjangan3(), configurationProperties.getNotes());
		extentTest.log(LogStatus.PASS, "User Input Data  and click Kirim");
	}
	
	@When("^User filter dan reset table Pending")
	public void User_filter_dan_reset_table_Pending() {
		pending.filterreset();
		extentTest.log(LogStatus.FAIL, "User Fail filter dan reset table Pending");
	}
	
	@When("^User show entries 100 table Pending")
	public void User_show_entries_100_table_Pending() {
		pending.entries();
		extentTest.log(LogStatus.PASS, "User show entries 100 Table");
	}
	
	@Then("^User searches by date table Pending")
	public void User_searches_by_date_table_Pending() {
		pending.search(configurationProperties.getSearch());
		extentTest.log(LogStatus.FAIL, "User Fail searches by date");
	}
	
	@When("^User click Tracking")
	public void User_click_Tracking() {
		tracking.Request();
		extentTest.log(LogStatus.PASS, "User click Tracking");
	}
	
	@When("^User filter dan reset table Tracking")
	public void User_filter_dan_reset_table_Tracking() {
		tracking.filterreset();
		extentTest.log(LogStatus.FAIL, "User Fail filter dan reset table Pending");
	}
	
	@When("^User show entries 100 table Tracking")
	public void User_show_entries_100_table_Tracking() {
		tracking.entries();
		extentTest.log(LogStatus.PASS, "User show entries 100 Table");
	}
	
	@Then("^User searches by date table Tracking")
	public void User_searches_by_date_table_Tracking() {
		tracking.search(configurationProperties.getSearch());
		extentTest.log(LogStatus.FAIL, "User Fail searches by date");
	}
	
	@When("^User click Surat Peringatan")
	public void User_click_Surat_Peringatan() {
		suratPeringatan.Teguran();
		extentTest.log(LogStatus.PASS, "User click Surat Peringatan");
	}
	
	@When("^User click LogOut")
	public void User_click_LogOut() {
		logOut.Exit();
		extentTest.log(LogStatus.PASS, "User click LogOut");
	}
	
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
