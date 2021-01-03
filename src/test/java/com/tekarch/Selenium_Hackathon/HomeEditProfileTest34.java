package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeEditProfileTest34 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		editProfile();
		
	}

	public static void editProfile() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		waitExplicitly(10, driver.findElement(By.xpath("//a[@class='userMru']")));
		driver.findElement(By.xpath("//a[@class='userMru']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@id='moderatorMutton']")));
		driver.findElement(By.xpath("//a[@id='moderatorMutton']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.id("aboutMeContentId")));
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		waitExplicitly(10, lname);
		lname.clear();
		lname.sendKeys("Abcd");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@value='Save All']")));
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();	  

	}

}
