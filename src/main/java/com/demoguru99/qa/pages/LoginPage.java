package com.demoguru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="uid")
	WebElement userID;
	
	@FindBy(name="password")
	WebElement password ;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitle() {
		return driver.getTitle();		
	}
	
   public HomePage loginCredential(String un,String pwd) {
	   userID.sendKeys(un);
	   password.sendKeys(pwd);
	   loginBtn.click();
	   return new HomePage();   
   }
}
