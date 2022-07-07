package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.testleaf.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public static String leadName;
	public static String dupLeadName;

	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage confirmFirstName(String fName) {
		Assert.assertEquals(fName,driver.findElement(By.id("viewLead_firstName_sp")).getText());
		return this;
	}

	public MyLeadsPage clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	}

	public ViewLeadPage getLeadName() {
		leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(leadName);
		return this;
	}

	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}

	public ViewLeadPage verifyDupLeadName() throws InterruptedException {
		
		Thread.sleep(3000);
		dupLeadName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(leadName, dupLeadName);
		return this;
	}
	
	public EditLeadPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public void verifyUpdatedCompName() {
		boolean contains = driver.findElement(By.id("viewLead_companyName_sp")).getText().contains("Thunderbird");
		Assert.assertTrue(contains);
	}
}
