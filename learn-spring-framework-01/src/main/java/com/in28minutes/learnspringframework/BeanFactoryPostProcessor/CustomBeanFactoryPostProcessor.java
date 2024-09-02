package com.in28minutes.learnspringframework.BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		String[] beanDefNames = beanFactory.getBeanDefinitionNames();
		for(String beanDefName : beanDefNames){
			
			BeanDefinition beanDef = beanFactory.getBeanDefinition(beanDefName);
			System.out.println(beanDef);

			if(beanDef.getBeanClassName().endsWith("Test")){
				beanDef.setScope("prototype");
				beanDef.setLazyInit(true);
			}
			System.out.println(beanDef);
		}
	}

}
