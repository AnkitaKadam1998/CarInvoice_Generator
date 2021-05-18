package com.tdd_day30;

public class CabService {

	public double calculatefare(final double distance, final int minute) 
	{
	double totalfare = 0;
	if(distance == 0.0 && minute == 0)
	{
		totalfare=0;
	}
	if(distance < 1.0 && minute <=5)
	{
		return totalfare;
	}
	totalfare=(distance * 10) + minute;
	
	return totalfare;
	}
	
	public double totalfareforMultipleride(final double totalfare2,final int numofride)
	{
		double totalfareforMultipleride=totalfare2* numofride;
		return totalfareforMultipleride;
	}
}
