Feature:  Request Staff

	Scenario: Pending
		When User click Pending
		When User Input Data  and click Kirim
		When User show entries 100 table Pending
		Then User searches by date table Pending
		
	Scenario: Tracking
		When User click Tracking
		When User filter dan reset table Tracking
		When User show entries 100 table Tracking
		Then User searches by date table Tracking