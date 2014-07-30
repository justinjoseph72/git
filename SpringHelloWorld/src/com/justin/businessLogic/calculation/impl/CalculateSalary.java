package com.justin.businessLogic.calculation.impl;

import com.justin.businessLogic.interfaces.Calculate;

public class CalculateSalary implements Calculate
{
	private double basic;
	private double TA;
	

	public double getBasic()
	{
		return basic;
	}


	public void setBasic(double basic)
	{
		this.basic = basic;
	}


	public double getTA()
	{
		return TA;
	}


	public void setTA(double tA)
	{
		TA = tA;
	}


	@Override
	public boolean calculate()
	{
		System.out.println("calculating salary");
		double totalSalary =this.getBasic()+this.getTA();
		System.out.println("total salary is "+ totalSalary );
		return true;
	}

}
