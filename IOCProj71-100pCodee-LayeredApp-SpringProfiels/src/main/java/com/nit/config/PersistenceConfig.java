package com.nit.config;



import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nit.dao")
public class PersistenceConfig {
	
	@Bean(name="dbcpDs")
	@Profile("dev")
	public BasicDataSource createApacheDBCP2DS() {
		System.out.println("PersistenceConfig.createApacheDBCP2DS()");
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql:///zafarspring");
		bds.setUsername("root");
		bds.setPassword("zafar");
		return bds;
		
	}
	@Bean(name="tomcatDs")
	@Profile("test")
	public DataSource createTomcatDS() {
		System.out.println("PersistenceConfig.createTomcatDS()");
		DataSource ds=new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///zafarspring");
		ds.setUsername("root");
		ds.setPassword("zafar");
		return ds;
	}
	
	@Bean(name="c3P0Ds")
	@Profile("uat")
	public ComboPooledDataSource createC3P0DS()throws Exception{
		System.out.println("PersistenceConfig.createC3PODS()");
		ComboPooledDataSource cds=new ComboPooledDataSource();
		cds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		cds.setUser("scott");
		cds.setPassword("tiger");
		return cds;
		
	}
	@Bean(name="hkDs")
	@Profile("prod")
	public HikariDataSource createHKDS()throws Exception{
		System.out.println("PersistenceConfig.createHKDS()");
		HikariDataSource hkDs=new HikariDataSource();
		hkDs.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkDs.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkDs.setUsername("scott");
		hkDs.setPassword("tiger");
		return hkDs;
		
	}
	
}
