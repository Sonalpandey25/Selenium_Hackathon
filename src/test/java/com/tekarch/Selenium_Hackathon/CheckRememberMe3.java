package com.tekarch.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckRememberMe3 extends LoginUtility{

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		checkRemember();
		logoutSalesforce();
		quitBrowser();

	}
	public static void checkRemember() throws Exception{
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		ele.sendKeys("sp25@abc.com");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("4y#Q2Atj@y");
		WebElement check = driver.findElement(By.xpath("//input[@name='rememberUn']"));
		waitExplicitly(10, check);
		check.isSelected();
		check.click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
