package com.home.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.model.Hospital;
import com.home.repository.HospitalRepo;

@RestController
@CrossOrigin(origins = "*")
public class HospitalrestController {
	
	@Autowired
	private HospitalRepo hrepo;
	

	@GetMapping("/api/hospital/list")
	public List<Hospital> getList()
	{
		return hrepo.findAll();
	}

	@GetMapping("/api/hospital/{hospitalId}")
	public Optional<Hospital> getHospitalList(@PathVariable ("hospitalId") Integer hospitalId)
	{
		return hrepo.findById(hospitalId);
	}
	
	
	@PostMapping("/api/hospital/register")
	public String addHospital(@RequestBody Hospital h)
	{
		
		hrepo.save(h);
		
		return "new hospital added";
		
		
	}
	

	@PostMapping("/api/hospital/userHospitalRegister")
	public String adduserHospital(@RequestBody Hospital h)
	{
		
		hrepo.save(h);
		
		return "new hospital added";
		
		
	}
	
	
		
}
