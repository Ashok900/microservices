package com.ex.openfeign.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.support.FeignEncoderProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;

public class BookClientConfig2 {
	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
	
	@Bean
	public BasicAuthenticationInterceptor basicAuthenticationInterceptorBookService(@Value("${book-service-client.username}") String username, @Value("${book-service-client.password}") String password) {
		System.out.println("basicAuthenticationInterceptorBookService");
		return new BasicAuthenticationInterceptor(username, password);
		
	}
	
	@Bean
	public ErrorDecoder errorDecoder() {
		 return (ErrorDecoder) new FeignEncoderProperties();
	}
	
	@Bean
	public RequestInterceptor requestInterceptor(@Value("${book-service-client.username}") String username,@Value("${book-service-client.password}") String password) {
		return requestTemplate->{
			requestTemplate.header("user", username);
			requestTemplate.header("password", password);
		};
		
	}

}
