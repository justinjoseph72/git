package com.justin.shapeImpl;

import com.justin.shapeInterface.Shape;

public class Circle implements Shape
{
	
	
	public Circle(String color)
	{
		this.color = color;
	}
	private String color;
	@Override
	public void draw()
	{
		System.out.println("drawing a" +this.color+" Circle");

	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}

}
