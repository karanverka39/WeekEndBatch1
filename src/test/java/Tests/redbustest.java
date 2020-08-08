package Tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import InitiateTests.inittt;
import Pages.redbuspage;

public class redbustest extends inittt{
	//1. create Object and call .
	private static final Logger LOGGER = LoggerFactory.getLogger(redbustest.class);
	
	@Test
	
	public void bookticket() throws InterruptedException
	{


		homePage.selectFrom();
		homePage.selectTo();
		homePage.dateSelect();
		homePage.searchButtonclick();
		Thread.sleep(4000);
	    homePage.close();
	    homePage.scrollDown();
	    homePage.clickViewSeat();
	    Thread.sleep(3000);
	    homePage.clickBusSeat();
	    homePage.selecttime();
homePage.continuee();
homePage.proceed();
	}
		@Test
		public void checkTitle() {
			//title dikhayi de rha h ya nhi...
			
			
			Assert.assertEquals(homePage.getTitle(), "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India");
		}
		
		
	}
	

