package com.tekarch.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUtility {
	public static WebDriver driver;

	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void gotoSalesforce() {
		driver.get("https://login.salesforce.com");
	}

	public static void loginSalesforce() {
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		ele.sendKeys("sp25@abc.com");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("4y#Q2Atj@y");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	public static void logoutSalesforce() {
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		ele.click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Logout']")));
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void waitExplicitly(int iSeconds, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, iSeconds);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
