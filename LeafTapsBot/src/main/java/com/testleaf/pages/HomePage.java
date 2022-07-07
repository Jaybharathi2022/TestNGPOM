package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);

	}

	public LoginPage clickLogout() {
		// TODO Auto-generated method stub
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

}
