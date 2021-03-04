package com.nit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {PersistenceAppConfig.class,ServiceAppConfig.class})
public class BusinessAppConfig {

}
