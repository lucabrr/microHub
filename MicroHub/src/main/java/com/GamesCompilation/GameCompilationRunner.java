package com.GamesCompilation;

import java.time.LocalDate;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.GamesCompilation.classes.UserRecord;
import com.GamesCompilation.service.UserRecordService;
import com.github.javafaker.Faker;
@Component
public class GameCompilationRunner implements CommandLineRunner {
	@Autowired UserRecordService usr;
	 Faker faker = new Faker();
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
