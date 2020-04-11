package com.demoguru99.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoguru99.qa.base.BaseClass;
import com.demoguru99.qa.pages.HomePage;
import com.demoguru99.qa.pages.LoginPage;
import com.demoguru99.qa.pages.NewAccountPage;

public class NewAccountTest extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;
	NewAccountPage newAccountPage;

		
	 public NewAccountTest() {
		 super();		 
	 }	 
	 @BeforeClass
	 public void setUp() {
		 initialization();
		 loginPage= new LoginPage(); 
		 homePage = loginPage.loginCredential(prop.getProperty("username"), prop.getProperty("password"));
		 homePage.newAccountLink();
		 newAccountPage = new NewAccountPage();		
	 }
	 
     @Test (priority = 1)
	 public void verifyNewAccountPageTitleTitle(){
		 String Title= newAccountPage.newAccountPageTitle();
		 System.out.println(Title);
		 Assert.assertEquals(Title,"Guru99 bank add new account");	 
	 }
     @Test (priority = 2)
     public void validateCustomerInfo() {
    	 newAccountPage.enterCustomerId();
    	 newAccountPage.selectAccount();
    	 newAccountPage.initialDeposit();
    	 newAccountPage.submitBtn();   	 
     }
     @Test (priority = 3)
     public void messageVerification() {
    	String msg= newAccountPage.successMessage();
    	System.out.println(msg);
    	Assert.assertEquals(msg, "Account Generated Successfully!!!");   	 
     }
     @AfterClass
     public void tearDown() {
    	 driver.close();
     }
    
}
