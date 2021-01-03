package com.tekarch.Selenium_Hackathon;

public class LoginSuccessTest2 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		quitBrowser();

	}

}
