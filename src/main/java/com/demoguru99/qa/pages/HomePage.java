package com.demoguru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99.qa.base.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(linkText="Manager")
	WebElement manager;
	
	@FindBy(linkText="New Customer")
	WebElement newCustomer;
	
	@FindBy(linkText="Edit Customer")
	WebElement editCustomer;
	
	@FindBy(linkText="New Account")
	WebElement newaccount;


public HomePage() {
	PageFactory.initElements(driver, this);
}

public String homePageTitle() {
	return driver.getTitle();
}
public NewCustomerPage newCustomerLink() {
	newCustomer.click();
	return new NewCustomerPage();
}
public void managerLink() {
	manager.click();	
}
public void editCustomerLink() {
	editCustomer.click();	
}
public void newAccountLink() {
	newaccount.click();	
}
}
