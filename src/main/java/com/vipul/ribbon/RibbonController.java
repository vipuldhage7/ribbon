package com.vipul.ribbon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

	@Autowired
	FeignInterface feignInterface;
	
	@GetMapping("/getCandidates")
	public List<Object> getCandidates()
	{
		return feignInterface.getCandidates();
	}
	
	@GetMapping("/getEmployeelist")
	public List<Object> getEmployeelist()
	{
		return feignInterface.getEmployeelist();
	}
}
