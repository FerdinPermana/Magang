package com.juaracoding.HRIS.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.txt")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${notes}")
	private String notes;
	
	@Value("${nokartu}")
	private String nokartu;
	
	@Value("${namaPIC}")
	private String namaPIC;
	
	@Value("${NoRekening}")
	private String NoRekening;
	
	@Value("${nilaiklaim}")
	private String nilaiklaim;
	
	@Value("${search}")
	private String search;
	
	@Value("${unit}")
	private String unit;
	
	@Value("${jmlhorang}")
	private String jmlhorang;
	
	@Value("${deskripsipekerjaan}")
	private String deskripsipekerjaan;
	
	@Value("${umur1}")
	private String umur1;
	
	@Value("${umur2}")
	private String umur2;
	
	@Value("${lainnya}")
	private String lainnya;
	
	@Value("${masapercobaan}")
	private String masapercobaan;
	
	@Value("${gaji}")
	private String gaji;
	
	@Value("${jabatan}")
	private String jabatan;
	
	@Value("${transportasi}")
	private String transportasi;
	
	@Value("${komunikasi}")
	private String komunikasi;
	
	@Value("${note}")
	private String note;
	
	@Value("${TanggalResign}")
	private String TanggalResign;
	
	@Value("${Questioner}")
	private String Questioner;
	
	@Value("${Tempat}")
	private String Tempat;
	
	@Value("${Alamat}")
	private String Alamat;
	
	@Value("${StaffHadir}")
	private String StaffHadir;
	
	@Value("${JmlhKlaim}")
	private String JmlhKlaim;
	
	@Value("${Materai}")
	private String Materai;
	
	@Value("${Nama}")
	private String Nama;
	
	@Value("${JabatanUsaha}")
	private String JabatanUsaha;
	
	@Value("${NamaPerusahaan}")
	private String NamaPerusahaan;
	
	@Value("${StaffygHadir}")
	private String StaffygHadir;
	
	@Value("${GajiPokok}")
	private String GajiPokok;
	
	@Value("${Tunjangan1}")
	private String Tunjangan1;
	
	@Value("${Tunajngan2}")
	private String Tunajngan2;
	
	@Value("${Tunjangan3}")
	private String Tunjangan3;
	
	@Value("${TglEfektif}")
	private String TglEfektif;
	
	@Value("${Aspek1}")
	private String Aspek1;
	
	@Value("${Aspek2}")
	private String Aspek2;
	
	@Value("${Aspek3}")
	private String Aspek3;
	
	@Value("${notepromotion}")
	private String notepromotion;
	
	@Value("${SearchTracking}")
	private String SearchTracking;

	public String getBrowser() {
		return browser;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

	public String getNotes() {
		return notes;
	}

	public String getNokartu() {
		return nokartu;
	}

	public String getNamaPIC() {
		return namaPIC;
	}

	public String getNoRekening() {
		return NoRekening;
	}

	public String getNilaiklaim() {
		return nilaiklaim;
	}

	public String getSearch() {
		return search;
	}

	public String getUnit() {
		return unit;
	}

	public String getJmlhorang() {
		return jmlhorang;
	}

	public String getDeskripsipekerjaan() {
		return deskripsipekerjaan;
	}

	public String getUmur1() {
		return umur1;
	}

	public String getUmur2() {
		return umur2;
	}

	public String getLainnya() {
		return lainnya;
	}

	public String getMasapercobaan() {
		return masapercobaan;
	}

	public String getGaji() {
		return gaji;
	}

	public String getJabatan() {
		return jabatan;
	}

	public String getTransportasi() {
		return transportasi;
	}

	public String getKomunikasi() {
		return komunikasi;
	}

	public String getNote() {
		return note;
	}

	public String getQuestioner() {
		return Questioner;
	}

	public String getTanggalResign() {
		return TanggalResign;
	}

	public String getTempat() {
		return Tempat;
	}

	public String getAlamat() {
		return Alamat;
	}

	public String getStaffHadir() {
		return StaffHadir;
	}

	public String getJmlhKlaim() {
		return JmlhKlaim;
	}

	public String getNama() {
		return Nama;
	}

	public String getJabatanUsaha() {
		return JabatanUsaha;
	}

	public String getNamaPerusahaan() {
		return NamaPerusahaan;
	}

	public String getStaffygHadir() {
		return StaffygHadir;
	}

	public String getGajiPokok() {
		return GajiPokok;
	}

	public String getTunjangan1() {
		return Tunjangan1;
	}

	public String getTunajngan2() {
		return Tunajngan2;
	}

	public String getTunjangan3() {
		return Tunjangan3;
	}

	public String getTglEfektif() {
		return TglEfektif;
	}

	public String getAspek1() {
		return Aspek1;
	}

	public String getAspek2() {
		return Aspek2;
	}

	public String getAspek3() {
		return Aspek3;
	}
	

	public String getNotepromotion() {
		return notepromotion;
	}

	public String getSearchTracking() {
		return SearchTracking;
	}

}
