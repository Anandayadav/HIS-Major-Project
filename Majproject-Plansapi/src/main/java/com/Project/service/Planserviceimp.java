package com.Project.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.enity.Plans;
import com.Project.repo.Plansrepo;

@Service
public class Planserviceimp implements Planservice {

	@Autowired
	private Plansrepo planrepo;
	
	@Override
	public List<Plans> findPlans() {
		
		List<Plans>plans=planrepo.findAll();
		
		return plans;
	}

	@Override
	public boolean savePlan(Plans plan) {
		
		Plans found=planrepo.findByPlannameAndPid(plan.getPlanname(),plan.getPid());
		
		if(found==null)
		{
		Plans status=planrepo.save(plan);
		return true;
		}
		
		return false;
	}

	@Override
	public boolean updatePlan(Plans plan) {
		
		Plans planinfo=planrepo.findByPid(plan.getPid());
		
		if(planinfo!=null){
		planinfo.setStatus(plan.getStatus());
		planinfo.setEnddate(plan.getEnddate());
		planinfo.setPlanname(plan.getPlanname());
		planinfo.setStartdate(plan.getStartdate());
		planinfo.setPid(plan.getPid());
		return true;
		}
		
		return false;
	}

	@Override
	public boolean deletePlan(Integer pid) {
		
		Plans planinfo=planrepo.findByPid(pid);
		if (planinfo!=null)
		{
			planrepo.deleteByPid(pid);
			return true;
		}
		
		return false;
	}

}
