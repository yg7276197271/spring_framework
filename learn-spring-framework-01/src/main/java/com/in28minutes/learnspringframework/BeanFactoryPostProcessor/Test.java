package com.in28minutes.learnspringframework.BeanFactoryPostProcessor;

import org.springframework.stereotype.Component;

@Component
public class Test {
	Test(){
		System.out.println("Test bean dependency is injected");
	}
}
