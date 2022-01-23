Feature:  Reimbursement

	Scenario: Klaim Asuransi
		When User click Klaim Asuransi
		When User add Klaim Asuransi
		When User Upload Dokumen dan kirim Asuransi
		When User filter dan reset table Asuransi
		When User show entries 100 Asuransi
		Then User searches by date Asuransi
	
	Scenario: Klaim Kacamata
		When User click Klaim Kacamata
		When User add Klaim Kacamata
		When User Upload Dokumen dan kirim Kacamata
		When User filter dan reset table Kacamata
		When User show entries 100
		Then User searches by date
		
	Scenario: Approval Klaim Kacamata
		When User click Approval Klaim Kacamata
		
		Scenario: Entertainment
		When User click Entertainment
		When User Add new Entertainment
		When User Input Pemberisumbangan
		When User Upload Dokumen dan kirim Entertainment
		When User filter dan reset table
		When User show entries 100
		Then User searches by date
		
	Scenario: Entertainment Approval
		When User click Entertainment Approval
		