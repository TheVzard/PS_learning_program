package com.publicisSapient.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Mobile mobile = (Mobile) factory.getBean("mobile");

		mobile.printSpecifications();
    }

}
