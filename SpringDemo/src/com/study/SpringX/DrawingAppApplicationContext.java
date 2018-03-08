package com.study.SpringX;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppApplicationContext {

	public static void main(String[] args) {
		//no need of filesystemresoruce
		//spring.xml should be in the src folder or else it won't work
		ApplicationContext  context= new ClassPathXmlApplicationContext("spring.xml");
		Triangle t=(Triangle)context.getBean("triangle");
		t.draw();
	}

}
