package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Autowired
	UpdateH2 updateH2;

	@PostMapping(path = "/update", consumes = "application/json", produces = "application/json")
	  public void update(@RequestBody KeyValueClass keyValueClass) {
		updateH2.updateValuewithKey(keyValueClass);
		
	  }
	
}
