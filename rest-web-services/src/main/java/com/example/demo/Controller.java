package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	@Autowired
	private Service service;
	
	@GetMapping("/data")
	public model getAllData()
	{
		return (model) service.allData();
	}
	@PostMapping(/adddata)
	public model saveData(@RequestBody)
	{
		return service.saveData();
	}
}
