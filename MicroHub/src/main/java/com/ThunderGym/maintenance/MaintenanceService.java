package com.ThunderGym.maintenance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ThunderGym.classes.Cliente;
import com.ThunderGym.classes.Fattura;
import com.ThunderGym.security.payload.RegisterDto;
import com.ThunderGym.service.ClienteService;
import com.ThunderGym.service.FatturaService;

@Service
public class MaintenanceService {
	@Autowired ClienteService cs;
	@Autowired FatturaService fs;
	@Autowired MaintenanceRepository mr;
	
	public void creaClienti() {
	for(int i = 0; i < 18; i++) {
		Cliente c = cs.creaClienteJF("meseCorrente");
		//System.out.println(c.toString());
		cs.salvaCliente(c);	
		Fattura f = fs.creaFattura(c);
		fs.salvaFattura(f);
		};
	for(int i = 0; i < 22; i++) {
		
		Cliente c = cs.creaClienteJF("menoUnMese");
		//System.out.println(c.toString());
		cs.salvaCliente(c);	
		Fattura f = fs.creaFatturaMenoMese(c);
		fs.salvaFattura(f);
		}
	
	System.out.println("mese corrente: " +fs.importoMeseCorrente());
	System.out.println("mese scorso: " + fs.importoMeseScorso());	
	};
	
	public void creaProject(String name){	
		Project p = new Project(name);
		mr.save(p);
		};
		
	public void salvaProject(Project p) {
		mr.save(p);
		};
		
	public Project findById(long id) {
		Project p = new Project();
		Optional<Project> optional = mr.findById(id);
		if(optional.isPresent()) {
			p = optional.get();
			return p;
		} return p;
	}
	public List<Project>findAll(){
		return (List<Project>) mr.findAll();
	};
}
