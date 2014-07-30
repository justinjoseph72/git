package com.justin.businessLogic.calculation.impl;

import java.util.Date;

import com.justin.businessLogic.interfaces.Calculate;

public class CalculateAgeImpl implements Calculate
{
	private float myDOB;
	


	public float getMyDOB()
	{
		return myDOB;
	}



	public void setMyDOB(float myDOB)
	{
		this.myDOB = myDOB;
	}



	@Override
	public boolean calculate()
	{
		System.out.println("age calculation happening");
		
		float age =10-this.getMyDOB();
		System.out.println("age is : "+ age);
		return true;
	}

}
