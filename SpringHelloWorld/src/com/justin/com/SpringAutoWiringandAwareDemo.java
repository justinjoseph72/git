package com.justin.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.justin.shapeInterface.Shape;

public class SpringAutoWiringandAwareDemo
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("springApplicationContext.xml");
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();

	}

}
