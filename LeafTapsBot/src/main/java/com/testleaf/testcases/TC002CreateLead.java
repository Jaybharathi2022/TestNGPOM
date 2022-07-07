package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC002CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		fileName="createLead";
	}
	@Test(dataProvider="getData")
	public void runCreateLead(String compName,String firstName,String lastName) {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLead()
		.confirmFirstName(firstName);
	}

}
