package com.lizi.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingTest 
{
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://cn.bing.com");
    	WebElement element = driver.findElement(By.cssSelector("#sb_form_q"));
    	//WebElement element = driver.findElement(By.id("sb_form_q"));
    	element.sendKeys("Hello");
    	element.submit();
    	Thread.sleep(5000);
    	driver.quit();
    	
    }
    public WebDriver driver() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://cn.bing.com");
    	Thread.sleep(5000);
    	driver.quit();
    	return driver;
    }
}
