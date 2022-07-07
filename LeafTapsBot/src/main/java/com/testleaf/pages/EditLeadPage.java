package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage updateCompName() {
		WebElement eleCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));

		eleCompanyName.clear();
		String newCompanyName = "Thunderbird";
		eleCompanyName.sendKeys(newCompanyName);
		return this;
		
	}
	
	public ViewLeadPage clickUpdate() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(3000);
		return new ViewLeadPage(driver);
		
	}
}
