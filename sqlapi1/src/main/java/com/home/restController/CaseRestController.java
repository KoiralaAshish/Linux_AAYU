package com.home.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.model.Cases;
import com.home.repository.CasesRepo;

@RestController
@CrossOrigin(origins = "*")
public class CaseRestController {
	
	@Autowired
	private CasesRepo crepo;
	
	@GetMapping("/api/cases/list")
	public List<Cases> getAll()
	{
		return crepo.findAll();
		
	}
	
	
	
	
	
	
	

}
