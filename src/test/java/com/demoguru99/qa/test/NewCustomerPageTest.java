package com.demoguru99.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoguru99.qa.base.BaseClass;
import com.demoguru99.qa.pages.HomePage;
import com.demoguru99.qa.pages.LoginPage;
import com.demoguru99.qa.pages.NewCustomerPage;
import com.demoguru99.qa.util.TestUtil;

public class NewCustomerPageTest extends BaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	NewCustomerPage newCustomerPage;
	String sheetName = "Register";
		
	 public NewCustomerPageTest() {
		 super();		 
	 }	 
	 @BeforeClass
	 public void setUp() {
		 initialization();
		 loginPage= new LoginPage(); 
		 homePage = loginPage.loginCredential(prop.getProperty("username"), prop.getProperty("password"));
		 homePage.newCustomerLink();
		 newCustomerPage= new NewCustomerPage();
	 }
	 
     @Test (priority = 1)
	 public void verifynewCustomerPageTitle(){
		 String Title= newCustomerPage.newCustomerPageTitle();
		 System.out.println(Title);
		 Assert.assertEquals(Title,"Guru99 Bank New Customer Entry Page");	 
	 }
     
     @DataProvider
     public Object [][] getDemoGuruData(){
    	 Object data[][]= TestUtil.getTestData(sheetName);
		return data;   	 
     }
         
     @Test(priority=2, dataProvider ="getDemoGuruData" )
	 public void fillFormToAddNewCustomer(String name,String sex,String dob,String address,String city,String state,
			 String pin,String mobileNum,String email,String pwd) throws InterruptedException {
    	 newCustomerPage.addNewCustomer(name,sex,dob,address,city,state,pin,mobileNum,email,pwd);
	}
     
     @Test(priority=3)
	 public void clickSubmmitButton() {
    	 newCustomerPage.submmitButton();		 		 
	 }
}
