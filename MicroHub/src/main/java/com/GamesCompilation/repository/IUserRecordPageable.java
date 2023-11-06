package com.GamesCompilation.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.GamesCompilation.classes.UserRecord;



public interface IUserRecordPageable extends PagingAndSortingRepository<UserRecord, Long> {

}
