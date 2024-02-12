package com.Project.enity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serialnumber;
	private Integer pid;
	private String planname;
	private String status;
	private LocalDate startdate;
	private LocalDate enddate;
	public Plans(Integer serialnumber, Integer pid, String planname, String status, LocalDate startdate,
			LocalDate enddate) {
		super();
		this.serialnumber = serialnumber;
		this.pid = pid;
		this.planname = planname;
		this.status = status;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public Plans() {
		super();
	}
	public Integer getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(Integer serialnumber) {
		this.serialnumber = serialnumber;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	
	
	
}
