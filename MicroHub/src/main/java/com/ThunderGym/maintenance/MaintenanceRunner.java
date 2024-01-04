package com.ThunderGym.maintenance;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ThunderGym.security.payload.RegisterDto;
@Component
public class MaintenanceRunner implements CommandLineRunner {
	@Autowired MaintenanceService ms;
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//ms.creaClienti();
//		ms.creaProject("ThunderGym");
//		ms.creaProject("GamesCompilation");
		
		
	}

}
