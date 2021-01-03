package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditViewTest12 extends LoginUtility {

	public static void main(String[] args) throws Exception{
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		editView();
		quitBrowser();

	}
	public static void editView() throws Exception {
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Accounts Tab']")));
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")));
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
		WebElement viewunique = driver.findElement(By.xpath("//input[@id='devname']"));
		waitExplicitly(10, viewunique);
		viewunique.clear();
		viewunique.sendKeys("Selenium_unique");
		
	}

}
