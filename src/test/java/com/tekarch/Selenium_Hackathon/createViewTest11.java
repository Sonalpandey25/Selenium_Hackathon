package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class createViewTest11 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		createView();
		quitBrowser();

	}

	public static void createView() throws Exception {
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Accounts Tab']")));
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='fname']")));
		WebElement type = driver.findElement(By.xpath("//input[@id='fname']"));
		type.sendKeys("Selenium");
		WebElement viewunique = driver.findElement(By.xpath("//input[@id='devname']"));
		waitExplicitly(10, viewunique);
		viewunique.clear();
		viewunique.sendKeys("Selenium_unique");
		driver.findElement(By.xpath("(//input[@value=' Save '])[1]")).click();
	}
}
