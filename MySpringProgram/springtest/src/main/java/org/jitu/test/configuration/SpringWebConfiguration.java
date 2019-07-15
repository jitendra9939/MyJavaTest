package org.jitu.test.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages ="org.jitu.test" )
@EnableWebMvc
public class SpringWebConfiguration {
	
	ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/jsps/", ".jsp");
		return viewResolver;
	}
}
