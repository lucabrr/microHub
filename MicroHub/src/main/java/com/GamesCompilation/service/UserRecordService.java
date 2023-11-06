package com.GamesCompilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.GamesCompilation.classes.UserRecord;
import com.GamesCompilation.repository.IUserRecordDAO;
import com.GamesCompilation.repository.IUserRecordPageable;

import jakarta.persistence.EntityExistsException;

@Service
public class UserRecordService {
	@Autowired IUserRecordDAO userRecordDao;
	@Autowired IUserRecordPageable usrpDAO;
	
	public UserRecord getByUsername(String username) {
		return userRecordDao.findByUsername(username);
	}
	
	public UserRecord save (UserRecord userRecord) {
		UserRecord checkUser = getByUsername(userRecord.getUsername());
		if(checkUser != null) {
		if(userRecord.getUsername().equals(checkUser.getUsername())) {
			throw new EntityExistsException("username already exist");
		}}
		return userRecordDao.save(userRecord);
	}
	public List<UserRecord> getAll() {
		return (List<UserRecord>) userRecordDao.findAll();
	}
	public Page<UserRecord> getAllPageable(Pageable pageable){
		return usrpDAO.findAll(pageable);
	}
	public void deleteById(long id) {
		userRecordDao.deleteById(id);
	}
	
	
}
