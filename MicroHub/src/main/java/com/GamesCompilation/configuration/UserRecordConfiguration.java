package com.GamesCompilation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.GamesCompilation.classes.UserRecord;



@Configuration
public class UserRecordConfiguration {
 
	@Bean
	@Scope("prototype")
	UserRecord userRecord () {
		return new UserRecord();
	}
}
