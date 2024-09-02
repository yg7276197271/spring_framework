package com.in28minutes.learnspringframework.BeanFactoryPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
//Either We can declare initMethod and destroy method in @Bean definition
//Or we can implement classes InitializingBean,DisposableBean
public class InitSequenceBean implements InitializingBean,DisposableBean  {

	@Autowired
	Test test;
	
	public InitSequenceBean() {
		//Test bean dependency is injected
		System.out.println("InitSequenceBean: constructor");
		//Test test = new Test();
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("InitSequenceBean: postConstruct");
	}

	public void initMethod() {
		System.out.println("InitSequenceBean: init-method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitSequenceBean: afterPropertiesSet");
	}
	
	@PreDestroy
    public void preDestroy() {
        System.out.println("Spring Bean Pre Destroy Annotation Method");
                            
    }

	@Override
	public void destroy() throws Exception {
		System.out.println("Spring Disposable Bean  Destroy Method ");		
               
	}
}