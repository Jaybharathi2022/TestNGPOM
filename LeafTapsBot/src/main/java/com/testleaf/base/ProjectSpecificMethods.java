package com.testleaf.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.testleaf.utils.ReadFromExcel;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ProjectSpecificMethods {

	public RemoteWebDriver driver;
	public String fileName;

	//@Parameters("browser")
	@BeforeMethod
	public void preCondition(@Optional("chrome") String browser) {
		//launchBrowser(browser);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public void launchBrowser(String browser) {
		// TODO Auto-generated method stub
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="getData", indices=1)
	public String[][] fetchData() throws IOException {
		
		return ReadFromExcel.readFile(fileName);
		
	}

}
