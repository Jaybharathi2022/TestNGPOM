package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}

}
