package com.tekarch.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest4 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		WebElement un = driver.findElement(By.xpath("//input[@id='un']"));
		un.sendKeys("sp25@abc.com");
		waitExplicitly(10, un);
		driver.findElement(By.xpath("//input[@id='continue']"));
		gotoSalesforce();
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(10, ele);
		ele.sendKeys("123");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("22131");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		quitBrowser();

	}

}
