package com.sidharth.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class DemoFeignController {

	@Autowired
	private DemoRestWebServices services;
	
	@GetMapping("/test")
	public String testFeignController() {
		System.out.println("Hello from Feign Controller...");
		return services.testController(); 
	}
	
	@GetMapping("/data")
	public DummyEntityList getData() {
		return services.giveDataBack(); 
	}
	
}
