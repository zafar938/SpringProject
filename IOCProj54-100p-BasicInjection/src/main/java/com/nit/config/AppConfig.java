package com.nit.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.nit.beans")
public class AppConfig {
	
	static {
		System.out.println("AppConfig :: static block");
	}

	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
  @Bean(value="dt")
  @Primary
  public LocalDateTime createDate() {
	  System.out.println("AppConfig.createDate()");
	return LocalDateTime.now();
  }
	@Bean(value="dt1")
	public LocalDateTime createDate1() {
		System.out.println("AppConfig.createDate()");
		return LocalDateTime.now();
	  
  }
}
