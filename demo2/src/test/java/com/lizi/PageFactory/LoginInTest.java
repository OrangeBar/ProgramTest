package com.lizi.PageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginInTest {

	WebDriver driver;
	LoginIn objloginIn;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.testfire.net/login.jsp");
	}
	
	@Test
	public void test() {
		objloginIn = new LoginIn(driver);
		objloginIn.loginInTo("admin", "admin");
		String mainText = objloginIn.getMainText();
		Assert.assertTrue(mainText.contains("Congratulations!"));
		driver.quit();
	}

}
