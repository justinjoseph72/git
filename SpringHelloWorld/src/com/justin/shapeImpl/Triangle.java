package com.justin.shapeImpl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.justin.shapeInterface.Shape;

public class Triangle implements Shape,ApplicationContextAware,BeanNameAware
{

	private String color;
	private ApplicationContext context= null;
	private String myBeanName=null;
	public ApplicationContext getContext()
	{
		return context;
	}
	
	
	public String getColor()
	{
		return color;
	}
	public Triangle(String color)
	{
		super();
		this.color = color;
	}
	public void setColor(String type)
	{
		this.color = type;
	}
	@Override
	public void draw()
	{
		System.out.println("Drawing a"+ this.color +" triangle");
		//using applicationContextAware to get the context and using it to get the object of Triangle point
		TrianglePoint myTrianglePoint = (TrianglePoint)context.getBean("trianglePoint");
		myTrianglePoint.draw();
		
		
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException
	{
		System.out.println("The context is set");
		this.context =arg0;
		
	}
	@Override
	public void setBeanName(String arg0)
	{
		myBeanName =arg0;
		System.out.println("The bean name used is "+ arg0);
		
	}

}
