package com.pupu;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestAppian {
private String baseUrl;
private WebDriver dr;

private WebElement element;

  @BeforeMethod
  public void beforeMethod() {
	  dr=new ChromeDriver();
	  baseUrl="https://community.appian.com/";
	  
	  //System.out.println("----Before Method---");
	  
  }
  
  @Test
  public void f() {
	  dr.get(baseUrl);
	  dr.manage().window().maximize();
	  element = dr.findElement(By.xpath("//*[@id=\"fragment-13345_Search\"]"));
	  element.sendKeys("learning");
	  element.sendKeys(Keys.RETURN);
	  System.out.println("----Test----");  
  }
  @AfterMethod
  public void afterMethod() {
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dr.quit();
	  System.out.println("---After Method----");  
  }

}
