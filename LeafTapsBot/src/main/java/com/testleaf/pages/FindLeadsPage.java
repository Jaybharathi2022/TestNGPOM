package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {

	public static String firstLead;

	public FindLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public FindLeadsPage clickOnPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public FindLeadsPage enterPhoneNumber() {
		driver.findElement(By.xpath("//div[@class='x-plain-bwrap']//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}

	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;

	}

	public ViewLeadPage clickFirstResultingLead() {
		// Capture lead ID of First Resulting lead
		WebElement eleFirstLead = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]"));
		firstLead = eleFirstLead.getText();

		// Click First Resulting lead
		eleFirstLead.click();
		return new ViewLeadPage(driver);
	}

	public FindLeadsPage enterLeadID() {
		driver.findElement(By.name("id")).sendKeys(firstLead);
		return this;
	}

	public FindLeadsPage verifyLeadDisplayed() throws InterruptedException {
		// Verify message "No records to display" in the Lead List
		Thread.sleep(3000);
		String displayedText = driver.findElement(By.xpath("//div[@class ='x-paging-info']")).getText();
		System.out.println(displayedText);
		return this;
	}

	public FindLeadsPage clickOnEmail() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		return this;
	}

	public FindLeadsPage enterEmail() {
		driver.findElement(By.name("emailAddress")).sendKeys("s");
		return this;
	}

	public FindLeadsPage enterFirstName() {
		driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='firstName']")).sendKeys("a");
		return this;

	}

}
