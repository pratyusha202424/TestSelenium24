package com.pupu.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestWebPageSearch {
	
	@BeforeMethod
	public void setUp() throws Exception {
		 WebDriver dr=new ChromeDriver();
	     dr.get("https://community.appian.com/");
	     dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
