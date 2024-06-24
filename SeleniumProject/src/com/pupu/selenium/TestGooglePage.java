package com.pupu.selenium;

/*import java.time.Duration;*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestGooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		//WebDriver dr = new FirefoxDriver();
		dr.get("https://www.google.com");
		
		// dr.findElement(By.xpath(".//*[@class='gLFyf']")).sendKeys("Need Xpath help");
		 dr.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Need Xpath help");
		  
		 // dr.findElement(By.xpath(".//*[@class='gLFyf']")).sendKeys(Keys.RETURN);
		 dr.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys(Keys.RETURN);
		  //dr.findElement(By.xpath(".//*[@input='gNO89b']")).click();
		  //dr.findElement(By.xpath("")).se
		 
	}

}
