//package com.crud.jpa.h2.filter;
//
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.time.LocalDateTime;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import org.springframework.stereotype.Component;
//
//import org.springframework.web.filter.OncePerRequestFilter;
//import org.springframework.web.util.ContentCachingRequestWrapper;
//import org.springframework.web.util.ContentCachingResponseWrapper;
//
//
//
//@Component
//public class LoggingFilter extends OncePerRequestFilter {
//
//
//	
//private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);
//	
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException 
//	{
//		
//	ContentCachingRequestWrapper contentCachingRequestWrapper = new ContentCachingRequestWrapper(request);
//	ContentCachingResponseWrapper contentCachingResponseWrapper = new ContentCachingResponseWrapper(response);
//	
//	Long startTime = System.currentTimeMillis();
//
//	filterChain.doFilter(contentCachingRequestWrapper, contentCachingResponseWrapper);
//	
//	Long timeTaken = System.currentTimeMillis()- startTime;
//	
//	String requestBody = getStringValue(contentCachingRequestWrapper.getContentAsByteArray(),request.getCharacterEncoding());
//	String responseBody = getStringValue(contentCachingResponseWrapper.getContentAsByteArray(),response.getCharacterEncoding());
//	
//	LOGGER.info("filter logs : METHOD = {};REQUESTURI = {}; REQUEST BODY ={}; RESPONSE CODE= {};STARTTIME ={};TIMETAKEN = {}; RESPONSE BODY ={}",
//					request.getMethod(), request.getRequestURI(), requestBody, response.getStatus(),startTime, timeTaken, responseBody);
//
//	contentCachingResponseWrapper.copyBodyToResponse();
//	
//	}
//
//	private String getStringValue(byte[] contentAsByteArray, String characterEncoding) 
//	{
//		try 
//		{
//			return new String(contentAsByteArray,0,contentAsByteArray.length,characterEncoding);
//		} 
//		catch (UnsupportedEncodingException e) 
//		{
//			e.printStackTrace();
//		}
//		return "";
//	}
//	
//		
//}
//

