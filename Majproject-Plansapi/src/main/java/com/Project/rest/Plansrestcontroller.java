package com.Project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.enity.Plans;
import com.Project.service.Planserviceimp;

@RestController
public class Plansrestcontroller {

	@Autowired
	private Planserviceimp planservice;
	
	@GetMapping("/findPlans")
	public List<Plans> findPlans()
	{
		
		List<Plans>plans=planservice.findPlans();
		
		return plans;
	}
	
	@PostMapping("/save-Plan")
	public String savePlan(@RequestBody Plans plan)
	{
		boolean status=planservice.savePlan(plan);
		
		if(status)
		{
			String saveSuccMsg="Plan has been inserted successfully...";
			return saveSuccMsg;
		}
		
		   String saveErrMsg="The plan has beem already present...";
		
		return saveErrMsg;	
	}
	
	
	@PostMapping("/update-Plan")
	public String upadtePlan(@RequestBody Plans plan)
	{
		boolean status=planservice.updatePlan(plan);
		
		if(status)
		{
			String updateSuccMsg="Plan has updated successfully...";
			return updateSuccMsg;
		}
		
		   String UpdateErrMsg="The searched record has not found...";
		
		return UpdateErrMsg;	
	}
	
@GetMapping("/delete-plan")
public String deletePlan(Integer pid)
	{
		boolean status=planservice.deletePlan(pid);
		
		if(status)
		{
			String deleteSuccMsg="Record has deleted successfully...";
			return deleteSuccMsg;
		}
		String deleteErrMsg="Record has not found..";
		return deleteErrMsg;
	}
	
	
	
	
}
