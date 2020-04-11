package com.demoguru99.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoguru99.qa.base.BaseClass;
import com.demoguru99.qa.pages.EditCustomerPage;
import com.demoguru99.qa.pages.HomePage;
import com.demoguru99.qa.pages.LoginPage;


public class EditCustomerTest extends BaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	EditCustomerPage editCustomerPage;
	String sheetName = "Register";
		
	 public EditCustomerTest() {
		 super();		 
	 }	 
	 @BeforeClass
	 public void setUp() {
		 initialization();
		 loginPage= new LoginPage(); 
		 homePage = loginPage.loginCredential(prop.getProperty("username"), prop.getProperty("password"));
		 homePage.editCustomerLink();
		 editCustomerPage = new EditCustomerPage(); 
		
	 }
	 
     @Test (priority = 1)
	 public void verifyEditCustomerPageTitle(){
		 String Title= editCustomerPage.editCustomerPageTitle();
		 System.out.println(Title);
		 Assert.assertEquals(Title,"Guru99 Bank Edit Customer Page");	 
	 }
     
     @Test (priority = 2)
     public void enterCustomerId() {
    	 editCustomerPage.customerId();    	 
     }
     
     @Test (priority = 3)
     public void clickSubmitBtn() {
    	 editCustomerPage.submitBtn();    	 
     }
     
     @Test (priority = 4)
     public void validateEditCustomerSymbol() {
    	 String Text= editCustomerPage.editCustomerSymbol();   
    	 System.out.println(Text);
    	 Assert.assertEquals(Text, "Edit Customer");
     }
     @AfterClass
	 public void tearDown() {
    	 driver.close(); 	 
     }
       
}
