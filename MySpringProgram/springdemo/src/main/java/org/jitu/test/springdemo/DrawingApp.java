package org.jitu.test.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		//Traingle traingle=new Traingle();
//		BeanFactory factory= new XmlBeanFactory(new FileSystemResource("context.xml"));
//		Traingle traingle=(Traingle) factory.getBean("traingle");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Traingle traingle=(Traingle) context.getBean("traingle");
		traingle.draw();
	}
}
