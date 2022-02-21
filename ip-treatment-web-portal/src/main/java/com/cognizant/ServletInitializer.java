package com.cognizant;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


 
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * to configure the application
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IpTreatmentWebPortalApplication.class);
	}

}
