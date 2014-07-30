package com.justin.shapeImpl;

import com.justin.shapeInterface.Shape;

public class Square implements Shape
{
	private String color;
	public Square(String color)
	{
		super();
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	@Override
	public void draw()
	{
		System.out.println("Drawing a"+this.color+" Square");
	}

}
