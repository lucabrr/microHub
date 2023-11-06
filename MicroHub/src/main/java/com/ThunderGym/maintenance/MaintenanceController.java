package com.ThunderGym.maintenance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/maintenance")
public class MaintenanceController {
	@Autowired MaintenanceService ms;
	@GetMapping("/creaClienti")
	public ResponseEntity<String> creaClienti(){
		try {
			ms.creaClienti();
			return new ResponseEntity<String>("clienti salvati",HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_GATEWAY);
		}
	}
	@GetMapping("/thundergym")
	public void getThunderGym(){
		try {
			Project p  = ms.findById(1);
			p.data.add(LocalDateTime.now());
			ms.salvaProject(p);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	@GetMapping("/gamescompilation")
	public void getGamesCompilation(){
		try {
			Project p  = ms.findById(2);
			p.data.add(LocalDateTime.now());
			ms.salvaProject(p);
		} catch (Exception e) {  
			System.out.println(e.getMessage());
		}
		
	}
	@GetMapping("/getinfo")
	public ResponseEntity<?> getInfo(){
		try {
			List<Project> progetti = new ArrayList<Project>();
			progetti = ms.findAll();
			return new ResponseEntity<List<Project>>(progetti,HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.ACCEPTED);
		}
	}

}
