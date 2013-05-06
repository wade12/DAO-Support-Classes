package com.osgo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

import com.osgo.dao.JdbcDaoImpl;
import com.osgo.dao.SimpleJdbcDaoImpl;
import com.osgo.model.Circle;

public class JdbcSpring
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		SimpleJdbcDaoImpl dao = ctx.getBean("simpleJdbcDaoImpl", SimpleJdbcDaoImpl.class);
		
		// System.out.println(dao.getAllCircles().size());
		System.out.println(dao.getCircleCount());

	} // end method main

} // end Class jdbcDemo
