package com.Project.service;

import com.Project.entity.Citizenreg;
import com.Project.formbinding.Forgotpswrdform;
import com.Project.formbinding.Loginform;

public interface Citizenservice {

	public Citizenreg saveCitizen(Citizenreg citizen);

	public boolean searchBySsn(String ssn);
	
	public boolean loginCitizen(Loginform loginform);
	
	public boolean forgotPassword(Forgotpswrdform forgotpswrdform);
}
