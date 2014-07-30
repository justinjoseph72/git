/**
 * 
 */
package com.justin.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.justin.shapeInterface.Shape;

/**
 * @author justin
 *
 */
public class SpringApplicationContextDemo
{
public static void main(String[] args)
{
	String [] myshapes= {"circle","triangle","square","mixshape"};
	ApplicationContext myContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
	for(String aShape: myshapes)
	{
		Shape myShape = (Shape)myContext.getBean(aShape);
		myShape.draw();
	}
	
}
}
