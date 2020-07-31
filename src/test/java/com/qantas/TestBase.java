package com.qantas;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chrome2\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.qantas.com/in/en.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	}
	
	public static void captureScreenshot(String testMethodName)
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(srcFile, new File("F:\\WorkSpace\\javaPrograms\\verify\\ScreenShots\\"+testMethodName+".jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
