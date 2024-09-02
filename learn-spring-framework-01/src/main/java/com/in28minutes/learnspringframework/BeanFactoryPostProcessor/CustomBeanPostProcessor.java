package com.in28minutes.learnspringframework.BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
	//postProcessBeforeInitialization  is called after the bean is instantiated using Constructor and
	//bean dependencies are injected.
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Called postProcessBeforeInitialization() for :" + beanName);
		return bean;
	}
	//postProcessAfterInitialization is called after bean is initialized using @PostConstruct
	//or custom init-method or implementing InitizingBean interface afterPropertiesSet() method
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Called postProcessAfterInitialization() for :" + beanName);
		//You can create Proxy here after the init method
		return bean;
	}
}
