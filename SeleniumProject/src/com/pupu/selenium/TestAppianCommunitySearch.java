package com.pupu.selenium;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAppianCommunitySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver dr=new ChromeDriver();
     dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     dr.get("https://community.appian.com/");
     dr.manage().window().maximize();
     WebElement web= dr.findElement(By.xpath("//*[@id=\"fragment-13345_Search\"]"));
     web.sendKeys("learning");
     web.sendKeys(Keys.RETURN);
	}

}
