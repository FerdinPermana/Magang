package com.juaracoding.HRIS.utils;

public enum TestCases {


	T1("Login"),
	T2("Slip Gaji"),
	T3("Pengajuan Cuti"),
	T4("Persetujuan Cuti"),
	T5("Pengajuan Resign"),
	T6("Survey"),
	T7("Tanda Tangan Digital"),
	T8("Klaim Asuransi"),
	T9("Klaim Kacamata"),
	T10("Approval Klaim Kacamata"),
	T11("Entertainment"),
	T12("Entertainment Approval"),
	T13("Promotion"),
	T14("Promotion History"),
	T15("Pending"),
	T16("Tracking"),
	T17("Surat Peringatan"),
	T18("LogOut");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
