package com.sidharth.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DummyController {
	
	@GetMapping("/getData")
	public DummyEntityList giveDataBack() {
		
		List<DummyEntity> dummyList = null;
		try {
			DummyEntity d1 = new DummyEntity("1","DescOne");
			DummyEntity d2 = new DummyEntity("2","DescTwo");
			DummyEntity d3 = new DummyEntity("3","DescThree");
			
			dummyList = new ArrayList<DummyEntity>();
			dummyList.add(d1);
			dummyList.add(d2);
			dummyList.add(d3);
			
			DummyEntityList response = new DummyEntityList();
			response.setDummyEntityList(dummyList);
			return response;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/test")
	public String testController() {
		return "Hello from Controller";
	}
}
