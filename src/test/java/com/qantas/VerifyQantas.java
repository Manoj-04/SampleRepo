package com.qantas;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class VerifyQantas extends TestBase
{
	@BeforeMethod
	public void init()
	{
		initialization();
	}

	@Test(priority=1)
	public void LoginPageTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=2)
	public void HomePageTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=3)
	public void BookingPageTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
