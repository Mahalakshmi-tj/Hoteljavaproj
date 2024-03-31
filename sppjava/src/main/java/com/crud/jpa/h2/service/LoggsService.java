package com.crud.jpa.h2.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.jpa.h2.dao.LoggsRepository;
import com.crud.jpa.h2.entity.Loggs;
import com.crud.jpa.h2.entity.User;
//import com.crud.jpa.h2.filter.LoggingFilter;

@Service
public class LoggsService {
	
	
	@Autowired
	private LoggsRepository loggsRepository;


	public Loggs createLoggs(Loggs loggs) {
		return loggsRepository.save(loggs);
	}
	
	public LocalDateTime createDate(LocalDateTime date) {
		return loggsRepository.save(date);
	}
	
	public String createOpr(String operation) {
		return loggsRepository.save(operation);
	}
}
