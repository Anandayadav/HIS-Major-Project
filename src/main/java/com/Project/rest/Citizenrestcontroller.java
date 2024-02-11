package com.Project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.entity.Citizenreg;
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
	
}
