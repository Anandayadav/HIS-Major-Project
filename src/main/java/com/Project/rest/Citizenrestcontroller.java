package com.Project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.entity.Citizenreg;
import com.Project.formbinding.Forgotpswrdform;
import com.Project.formbinding.Loginform;
import com.Project.service.Citizenserviceimp;

@RestController
public class Citizenrestcontroller {
	
	@Autowired
	private Citizenserviceimp citizenservice;
	
	@PostMapping("/saveCitizen")
	public String SaveCitizen(@RequestBody Citizenreg citizenreg)
	{
		Citizenreg creg=citizenservice.saveCitizen(citizenreg);
		
	
		if(creg.getSsn()==citizenreg.getSsn())
		{
			String accSuccMsg=creg.getName() +",  your account has created successfully...";
			return accSuccMsg;
		}
		String accErrMsg="Please change the EmailId... ";
		return accErrMsg;
	}
	
	@PostMapping("/login")
	public String LoginCitizen(@RequestBody Loginform loginform)
	{
		boolean status=citizenservice.loginCitizen(loginform);
		
		if(status==true)
		{
			String logSuccMsg="Login successful...";
			return logSuccMsg;
		}
		
		String logErrMsg="Please check the credentials...";
		
		return logErrMsg;
		

	}
	
	@PostMapping("/forgotPassword")
	public String forgotPassword(@RequestBody Forgotpswrdform forgotpassword)
	{
		if (!forgotpassword.getNewpassword().equals(forgotpassword.getConfirmpassword()))		{
			String duplicateEmail="New password and confirm password must be same..";
			return duplicateEmail;
		}
		
		boolean status=citizenservice.forgotPassword(forgotpassword);
		
		if(status==true)
		{
			String emailSentMsg="Password Sent to your email successfully...";
			return emailSentMsg;
		}
		
		String emailErrMsg="Please change your email...";
		return emailErrMsg;
	}
	
	
}
