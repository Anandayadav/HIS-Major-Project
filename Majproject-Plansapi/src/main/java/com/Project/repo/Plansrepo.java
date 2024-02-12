package com.Project.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.enity.Plans;

@Repository
public interface Plansrepo extends JpaRepository<Plans, Integer>{

	public Plans findByPlannameAndPid(String pname ,Integer pid);
	
	public List<Plans>findByStartdate(LocalDateTime startdate);
	
	public Plans findByPid(Integer pid);
	
	public void deleteByPid(Integer pid);

}
