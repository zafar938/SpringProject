package com.nit.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nit.dao")
public class PersistanceConfig {
	
	@Bean(name="hkDs")
	public DataSource createDataSource() {
		HikariDataSource hkDs=new HikariDataSource();
		hkDs.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkDs.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkDs.setUsername("scott");
		hkDs.setPassword("tiger");
		hkDs.setIdleTimeout(100);
		hkDs.setMaximumPoolSize(200);
		return hkDs;
		
	}
	@Bean(name="jt")
	public JdbcTemplate createJt() {
		return new JdbcTemplate(createDataSource());
		
	}

}
