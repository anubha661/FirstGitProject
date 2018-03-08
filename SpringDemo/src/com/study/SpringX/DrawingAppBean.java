package com.study.SpringX;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingAppBean {
	
	public static void main(String args[])
	{
		//Triangle t=new Triangle();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t=(Triangle)factory.getBean("triangle");
		t.draw();
	}

}
