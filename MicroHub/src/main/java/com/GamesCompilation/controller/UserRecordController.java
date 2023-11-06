package com.GamesCompilation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GamesCompilation.classes.UserRecord;
import com.GamesCompilation.service.UserRecordService;



@RestController
@RequestMapping("/api/userRecord")
//@CrossOrigin(origins = "https://gamechart-19492.web.app", maxAge = 3600)
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserRecordController {
	@Autowired UserRecordService urs;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		try {
			return new ResponseEntity<List<UserRecord>>(urs.getAll(),HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_GATEWAY);
		}
	}
	@PostMapping
	public ResponseEntity<?> postUser(@RequestBody UserRecord userRecord){
		try {
			return new ResponseEntity<UserRecord>(urs.save(userRecord),HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("/pageable")
	public ResponseEntity<?> getAll(Pageable page){
		try {
			
			return new ResponseEntity<Page<UserRecord>>(urs.getAllPageable(page),HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
		}
	}

}
