package com.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.entity.Citizenreg;
import com.Project.formbinding.Forgotpswrdform;
import com.Project.formbinding.Loginform;
import com.Project.repo.Citizenrepo;
import com.Project.utils.Emailutils;

@Service
public class Citizenserviceimp implements Citizenservice {

	@Autowired
	private Citizenrepo citizenrepo;
	
	@Autowired
	private Emailutils emailutils;
	
	@Override
	public Citizenreg saveCitizen(Citizenreg citizen) {
		Citizenreg found=citizenrepo.findByEmail(citizen.getEmail());
		
		if(found!=null)
		{
			return found;
		}
		
		Citizenreg citizendata =citizenrepo.save(citizen);
		
		return citizendata;
	}

	@Override
	public boolean loginCitizen(Loginform loginform) {
		
		Citizenreg status=citizenrepo.findByEmailAndPassword(loginform.getEmail(),loginform.getPassword());
		
		if(status!=null)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean forgotPassword(Forgotpswrdform forgotpswrdform) {
		
		Citizenreg found=citizenrepo.findByEmail(forgotpswrdform.getEmail());
		
		if(found!=null) {
			
			String to=forgotpswrdform.getEmail();
			
			String subject="Password Recovery- Ananda";
			
			String body="<h1>Your Password :"+forgotpswrdform.getNewpassword()+"</h1>";
			
			return emailutils.SendEmail(to,subject,body);
			
	}
	
		return false;
	}

}
