package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.nit")
@ImportResource(locations="com/nit/cfgs/applicationContext.xml")
public class AppConfig {

}
