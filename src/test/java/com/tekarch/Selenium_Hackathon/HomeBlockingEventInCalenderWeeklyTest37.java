package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class HomeBlockingEventInCalenderWeeklyTest37 extends LoginUtility{

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		weeklyRecurrence();
		
	}

	public static void weeklyRecurrence() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Sunday January 3, 2021')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Sunday January 3, 2021')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")));
		driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='evt5']")));
		driver.findElement(By.xpath("//input[@id='evt5']")).sendKeys("Other"); 
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		driver.findElement(By.xpath("//input[@id='evt5']")).sendKeys("7:00 PM"); 
		driver.findElement(By.xpath("//input[@id='IsRecurrence']")).isSelected();
		driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='rectypeftw']")));
		driver.findElement(By.xpath("//input[@id='rectypeftw']")).sendKeys("Weekly"); 
		Thread.sleep(500);
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")));
		driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).sendKeys("1/17/2021");
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value=' Save '])[2]")));
		driver.findElement(By.xpath("(//input[@value=' Save '])[2]")).click();
		
	}

}
