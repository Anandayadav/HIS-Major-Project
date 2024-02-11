package com.Project.formbinding;


public class Forgotpswrdform {

	private String email;
	private String newpassword;
	private String confirmpassword;
	public Forgotpswrdform(String email, String newpassword, String confirmpassword) {
		super();
		this.email = email;
		this.newpassword = newpassword;
		this.confirmpassword = confirmpassword;
	}
	public Forgotpswrdform() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
	
}
