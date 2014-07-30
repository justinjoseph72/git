package com.justin.shapeImpl;

import com.justin.shapeInterface.Shape;

public class TrianglePoint implements Shape
{
private Point pointA;
private Point pointB;
private Point pointC;

	public Point getPointA()
{
	return pointA;
}
public void setPointA(Point pointA)
{
	this.pointA = pointA;
}
public Point getPointB()
{
	return pointB;
}
public void setPointB(Point pointB)
{
	this.pointB = pointB;
}
public Point getPointC()
{
	return pointC;
}
public void setPointC(Point pointC)
{
	this.pointC = pointC;
}
	@Override
	public void draw()
	{
		System.out.println("Point A is (" + this.getPointA().getX() + ", " + this.getPointA().getY() +" )" );
		System.out.println("Point B is (" + this.getPointB().getX() + ", " + this.getPointB().getY() +" )" );
		System.out.println("Point C is (" + this.getPointC().getX() + ", " + this.getPointC().getY() +" )" );
	}

}
