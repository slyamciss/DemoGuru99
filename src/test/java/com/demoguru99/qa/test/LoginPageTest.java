package com.demoguru99.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoguru99.qa.base.BaseClass;
import com.demoguru99.qa.pages.HomePage;
import com.demoguru99.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;
	
	
	 public LoginPageTest() {
		 super();		 
	 }
	 
	 @BeforeClass
	 public void setUp() {
		 initialization();
		 loginPage= new LoginPage(); 
	 }
	 
    @Test(priority=1)
	 public void validateloginPageTitle() {
		String title= loginPage.loginPageTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page");
		 }
    
    @Test(priority=2)
	 public void validateLoginCredential() {
		homePage = loginPage.loginCredential(prop.getProperty("username"), prop.getProperty("password"));		 
	 }
    
    @AfterClass
	 public void tearDown() {
		 driver.close();
	 }
}
