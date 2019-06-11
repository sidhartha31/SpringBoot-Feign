package com.sidharth.application;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="DemoRestWebServices", url="localhost:8081")
public interface DemoRestWebServices {
	
	@GetMapping("/api/test")
	public String testController();
	
	@GetMapping("/api/getData")
	public DummyEntityList giveDataBack();
}
