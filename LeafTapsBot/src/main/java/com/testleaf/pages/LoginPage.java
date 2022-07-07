package com.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="username") WebElement eleUserName;
	@FindBy(how=How.ID,using="password") WebElement elePassword;
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") WebElement eleLogin;
	
	public LoginPage enterUserName() {
		eleUserName.sendKeys("DemoSalesManager");
		return this;
	}
	
	public LoginPage enterPassword() {
		elePassword.sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickLogin() {
		eleLogin.click();
		return new HomePage(driver);
		
	}

}
