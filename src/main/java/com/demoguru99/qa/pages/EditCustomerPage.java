package com.demoguru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoguru99.qa.base.BaseClass;

public class EditCustomerPage extends BaseClass{
	
	@FindBy(name="cusid")
	WebElement customerID;
	
	@FindBy(name="AccSubmit")
	WebElement submitCustomerIDBtn;
	
	@FindBy(name="res")
	WebElement resetCustomerIDBtn;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	WebElement EditCustomerSymbol;
  
	public EditCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void customerId() {
		customerID.sendKeys("27097");		
	}
	public void submitBtn() {
		submitCustomerIDBtn.click();		
	}
	public String editCustomerPageTitle() {
		return driver.getTitle();
	}
	public String editCustomerSymbol() {
		return EditCustomerSymbol.getText();		
    }
}