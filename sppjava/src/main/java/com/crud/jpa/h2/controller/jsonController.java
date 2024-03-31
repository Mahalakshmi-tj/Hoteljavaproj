package com.crud.jpa.h2.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.jpa.h2.dao.LoggsRepository;
import com.crud.jpa.h2.service.LoggsService;


@RestController
public class jsonController {
	@Autowired
	LoggsService loggsService;
	
	
	
	Logger LOGGER = LoggerFactory.getLogger(jsonController.class);
	

	@PostMapping(value = "/call",
			consumes = MediaType.ALL_VALUE,
			produces = MediaType.ALL_VALUE)
	public String xmljson(@RequestBody String string, HttpServletRequest request, HttpServletResponse response) throws IOException
		{
	
		if(request.getHeader("Content-Type").equals("application/json")) 
			{
				if(request.getHeader("Accept").equals("application/xml"))
					{
					    LocalDateTime date = LocalDateTime.now();
					    String operation= "json to xml";
					   loggsService.createDate(date);
					   loggsService.createOpr(operation);
					   LOGGER.info("Date logs : "+ date);
					   LOGGER.info("Date logs : "+ operation);
//					    loggsRepository.save(date);
//					    loggsRepository.save(operation);
						JSONObject json = new JSONObject(string);
						return XML.toString(json);
					}
				return string;
			}

		if(request.getHeader("Content-Type").equals("application/xml"))
			{
				if(request.getHeader("Accept").equals("application/json"))
					{
						JSONObject json = XML.toJSONObject(string);
						return json.toString();
					}
				return string;	
			}
		return string;	
	}
}
