package com.tdd_day30;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CabServiceTest {
	
	@Test
	public void testCalculatorFare_should_return_total_fare()
		{
			CabService cabservice = new CabService();
			
			final double distance=260;
			final int minute=90;
			double totalfare= cabservice.calculatefare(distance,minute);
			
			assertEquals(2690,totalfare,0);
		}
	
	@Test
	public void testCalculatorFare_should_return_min_fare()
		{
			CabService cabservice = new CabService();
			
			final double distance=0.5;
			final int minute=5;
			double totalfare= cabservice.calculatefare(distance,minute);
			
			assertEquals(5,totalfare,0);
		}
	
	@Test
	public void testCalculatorFare_should_return_zero_fare()
		{
			CabService cabservice = new CabService();
			
			final double distance=0.0;
			final int minute=0;
			double totalfare= cabservice.calculatefare(distance,minute);
			
			assertEquals(0,totalfare,0);
		}

}
