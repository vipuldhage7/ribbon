package com.vipul.ribbon;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="registerservice")
@RibbonClient(name="registerservice")
public interface FeignInterface {

	@GetMapping("/getCandidates")
	public List<Object> getCandidates();
	
	@GetMapping("/getEmployeelist")
	public List<Object> getEmployeelist();
}
