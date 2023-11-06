package com.GamesCompilation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GamesCompilation.classes.UserRecord;


@Repository
public interface IUserRecordDAO extends CrudRepository<UserRecord, Long>{
	
	public UserRecord findByUsername(String username);

}
