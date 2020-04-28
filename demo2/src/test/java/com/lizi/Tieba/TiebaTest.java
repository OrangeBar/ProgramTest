package com.lizi.Tieba;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TiebaTest {
	WebDriver driver;
	
	@Before
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.get("https://zhidao.baidu.com/");
    	Thread.sleep(200);
	}
	
	@Test
	public void test() throws InterruptedException  {
		
    	String title = driver.getTitle();//获取标题
    	Assert.assertTrue(title.equals("百度知道 - 全球最大中文互动问答平台"));
    	
    	//通过id获取元素
    	WebElement element = driver.findElement(By.id("search-btn"));
    	Assert.assertTrue(element.getText().contains("搜索"));
    	
    	//通过css获取元素
    	 element = driver.findElement(By.cssSelector("#ask-btn-new"));
    	Assert.assertTrue(element.getText().contains("提问"));
    	driver.quit();
		
	}

}
