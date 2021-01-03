package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class HomeBlockingEventCalenderTest36 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		blockEvent();
	}

	public static void blockEvent() throws Exception {
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		//Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Sunday January 3, 2021')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Sunday January 3, 2021')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")));
		driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='evt5']")));
		driver.findElement(By.xpath("//input[@id='evt5']")).sendKeys("Other");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).sendKeys("9:00 PM");

		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value=' Save '])[2]")));
		driver.findElement(By.xpath("(//input[@value=' Save '])[2]")).click();

	}

}
