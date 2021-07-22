package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class MvcProj27BootFileUploadiingFileDownLoadingApplication {
      
	@Bean(name="multipartResolver")
	public CommonsMultipartResolver createCommonsMPResolver() {
		CommonsMultipartResolver resolver=new CommonsMultipartResolver();
		resolver.setMaxUploadSize(-1);
		resolver.setMaxUploadSizePerFile(-1);
		return resolver;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(MvcProj27BootFileUploadiingFileDownLoadingApplication.class, args);
	}

}
