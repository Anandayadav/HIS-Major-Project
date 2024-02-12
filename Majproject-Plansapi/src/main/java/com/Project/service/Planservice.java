package com.Project.service;

import java.time.LocalDateTime;
import java.util.List;

import com.Project.enity.Plans;

public interface Planservice {
	
	public List<Plans> findPlans();
	
	public boolean savePlan(Plans plan);
	
	public boolean updatePlan(Plans plan);
	
	public boolean deletePlan(Integer pid);

}
