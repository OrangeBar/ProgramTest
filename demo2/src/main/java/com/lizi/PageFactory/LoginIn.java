package com.lizi.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIn {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement userID;
	
	@FindBy(name="passw")
	WebElement password;
	
	@FindBy(id="_ctl0__ctl0_Content_Main_promo")
	WebElement mainText;
	
	@FindBy(name="btnSubmit")
	WebElement login;
	
	//赋值
	public LoginIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserID(String strUserID) {
		userID.sendKeys(strUserID);
	}
	
	public void setPassword(String psw) {
		password.sendKeys(psw);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public String getMainText() {
		return mainText.getText();
	}
	//登录
	public void loginInTo(String strUserID, String psw) {
		this.setUserID(strUserID);
		this.setPassword(psw);
		this.clickLogin();
	}
}
