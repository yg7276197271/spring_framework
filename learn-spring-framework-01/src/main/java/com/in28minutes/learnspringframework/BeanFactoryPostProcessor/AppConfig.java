package com.in28minutes.learnspringframework.BeanFactoryPostProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppConfig {
	// If we are making method as static then this Bean will be created first
	@Bean
	public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor() {
		return new CustomBeanFactoryPostProcessor();
	}

	@Bean
	public static CustomBeanPostProcessor customBeanPostProcessor() {
		return new CustomBeanPostProcessor();
	}
	//Either We can declare initMethod and destroy method in @Bean definition
	//Or we can implement classes InitializingBean,DisposableBean
	@Bean(initMethod="initMethod",destroyMethod = "destroy")
	public static InitSequenceBean initSequenceBean() {
		return new InitSequenceBean();

	}

}
