package com.tekarch.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginErrorTest1 extends LoginUtility {

	public static void main(String[] args) {

		launchbrowser();
		gotoSalesforce();
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		ele.sendKeys("sp25@abc.com");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		quitBrowser();

	}

}
