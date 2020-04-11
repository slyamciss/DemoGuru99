package com.demoguru99.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99.qa.base.BaseClass;

public class NewCustomerPage extends BaseClass {
	@FindBy(name="name")
	WebElement customerName;
	
//	@FindBy(xpath="//input[@name='rad1' and value='m']")
//	WebElement sexMale;
	
//	@FindBy(xpath="//input[@name='rad1' and value='f']")
//	WebElement sexFemale;
	
	@FindBy(name="rad1")
	WebElement sexFemale;
	
	@FindBy(id="dob")
	WebElement dateOfBirth;
	
	@FindBy(name="addr")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="pinno")
	WebElement pinNum;
	
	@FindBy(name="telephoneno")
	WebElement mobileNumber;
	
	@FindBy(name="emailid")
	WebElement emailAdd;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement submitBtn;
	
	@FindBy(name="res")
	WebElement resetBtn;
	
	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String newCustomerPageTitle() {
		return driver.getTitle();		
	}
	
	public void addNewCustomer(String name,String sex,String dob,String address,String city,String state,
			String pin,String mobileNum,String email,String pw) throws InterruptedException {
		
		customerName.sendKeys(name);	
		sexFemale.click();
		
//		if(sex.contentEquals("M")) {
//			sexMale.click();			
//		} else {
//			sexFemale.click();			
//		}	
//		dateOfBirth.sendKeys(dob);
//		dateOfBirth.click();
//		Thread.sleep(2000);
		WebElement dateBox = driver.findElement(By.id("dob"));
		dateBox.sendKeys("07262000");
		
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		pinNum.sendKeys(pin);
		mobileNumber.sendKeys(mobileNum);
		emailAdd.sendKeys(email);
		password.sendKeys(pw);
	}
		public void submmitButton() {
			submitBtn.click();			
		}
}
