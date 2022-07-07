package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	
	public MergeLeadsPage clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}

}
