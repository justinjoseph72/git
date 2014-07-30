package com.justin.shapeImpl;

import com.justin.shapeInterface.Shape;

public class Triangle implements Shape
{

	private String color;
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
		
	}

}
