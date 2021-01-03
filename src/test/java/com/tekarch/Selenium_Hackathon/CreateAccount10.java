package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccount10 extends LoginUtility{

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		createAcc();
		quitBrowser();
	}
	//driver.findElement(By.xpath())
	public static void createAcc() throws Exception {
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Accounts Tab']")));
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		waitExplicitly(15, driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).click();
		WebElement name = driver.findElement(By.xpath("//input[@id='acc2']"));
		name.sendKeys("XYZ");
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='acc6']")));
		WebElement type= driver.findElement(By.xpath("//select[@id='acc6']"));
		type.sendKeys("Technology Partner");
		WebElement customPriority = driver.findElement(By.xpath("//select[@id='00N4x00000DyRRm']"));
		customPriority.sendKeys("High");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value=' Save '])[1]")).click();
	}

}
