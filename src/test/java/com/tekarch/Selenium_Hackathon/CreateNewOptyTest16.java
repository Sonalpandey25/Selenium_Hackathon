package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class CreateNewOptyTest16 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		createOpty();
		//quitBrowser();
	}

	public static void createOpty() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//input[@value=' New ']")));
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='opp3']")));
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Opty1");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='opp3']")));
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("ABC");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='opp9']")));
		driver.findElement(By.xpath("//input[@id='opp9']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='opp11']")));
		driver.findElement(By.xpath("//select[@id='opp11']")).sendKeys("Qualification");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='opp12']")));
		driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("50");
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='opp6']")));
		driver.findElement(By.xpath("//select[@id='opp6']")).sendKeys("Web");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='opp17']")));
		driver.findElement(By.xpath("//input[@id='opp17']")).sendKeys("Compa");

	}

}
