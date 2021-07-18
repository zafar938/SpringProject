package com.nit.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages="com.nit.dao")
public class PersistenceConfig {
	
	@Bean
	public JndiObjectFactoryBean createJOFB() {
		JndiObjectFactoryBean bean=new JndiObjectFactoryBean();
		bean.setJndiName("java:/comp/env/DsJndi");
		return bean;
	}
	@Bean(name="template")
	public JdbcTemplate createTemplate() {
		return new JdbcTemplate((DataSource) createJOFB().getObject());
		
	}

}
