package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class WebMVCAppConfig {
    @Bean
	public TilesConfigurer createConfigurar() {
		
		TilesConfigurer configurer=new TilesConfigurer();
		configurer.setDefinitions("/WEB-INF/tiles.xml");
		return configurer;
		
	}
	
	
	@Bean
	public TilesViewResolver createTVR() {
		return new TilesViewResolver();
		
	}
}
