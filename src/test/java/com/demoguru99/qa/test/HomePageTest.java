package com.demoguru99.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoguru99.qa.base.BaseClass;
import com.demoguru99.qa.pages.HomePage;
import com.demoguru99.qa.pages.LoginPage;
import com.demoguru99.qa.pages.NewCustomerPage;

public class HomePageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
		
	 public HomePageTest() {
		 super();		 
	 }
	 
	 @BeforeClass
	 public void setUp() {
		 initialization();
		 loginPage= new LoginPage(); 
		 homePage = loginPage.loginCredential(prop.getProperty("username"), prop.getProperty("password"));
	 }
     @Test(priority=1)
	 public void verifyhomePageTitle() {
		 String Title= homePage.homePageTitle();
		 System.out.println("The title of the page is :" +Title);
		 Assert.assertEquals(Title, "Guru99 Bank Manager HomePage");	 
	 }
     @AfterClass
	 public void tearDown() {
		driver.close();		 
	 }
}
