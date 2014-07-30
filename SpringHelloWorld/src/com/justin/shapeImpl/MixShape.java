/**
 * 
 */
package com.justin.shapeImpl;

import com.justin.shapeInterface.Shape;

/**
 * @author justin
 * 
 */
public class MixShape implements Shape
{

	private Triangle aTriangle;

	public Triangle getaTriangle()
	{
		return aTriangle;
	}

	public void setaTriangle(Triangle aTriangle)
	{
		this.aTriangle = aTriangle;
	}

	public Circle getaCircle()
	{
		return aCircle;
	}

	public void setaCircle(Circle aCircle)
	{
		this.aCircle = aCircle;
	}

	public Square getaSquare()
	{
		return aSquare;
	}

	public void setaSquare(Square aSquare)
	{
		this.aSquare = aSquare;
	}

	private Circle aCircle;
	private Square aSquare;

	@Override
	public void draw()
	{
		System.out.println("Drawing a mix shape having a Circle of " + aCircle.getColor() + " a Sqaure of "
				+ aSquare.getColor() + " and a triangle of " + aTriangle.getColor());
	}

}
