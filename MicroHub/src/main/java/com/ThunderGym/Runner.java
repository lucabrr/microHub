package com.ThunderGym;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ThunderGym.classes.Cliente;
import com.ThunderGym.classes.Fattura;
import com.ThunderGym.security.payload.RegisterDto;
import com.ThunderGym.service.ClienteService;
import com.ThunderGym.service.FatturaService;


@Component
public class Runner implements CommandLineRunner {
	@Autowired ClienteService cs;
	@Autowired FatturaService fs;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		
				
				
				
				
				
		
	}

}
