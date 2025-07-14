package com_Reusable_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;



public class base_class {
	
	public static WebDriver driver;
	@BeforeSuite
	@Parameters({"browser","url"})
	public void openapplication(String br,String u) {
		
		if(br.equals("Chrome")) 
		{
			driver=new ChromeDriver();	
		}
		else if(br.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		driver.get(u);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterSuite
	public void closeapp() {
		driver.close();
	}

}
