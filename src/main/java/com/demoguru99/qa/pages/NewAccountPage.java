package com.demoguru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoguru99.qa.base.BaseClass;

public class NewAccountPage extends BaseClass {
	
	@FindBy(name="cusid")
	WebElement customerId;
	
	@FindBy(name="selaccount")
	WebElement accountType;
	
	@FindBy(name="inideposit")
	WebElement initialDeposit;
	
	@FindBy(name="button2")
	WebElement submitBtn;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	WebElement successfulMessage;
	
	public NewAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String newAccountPageTitle() {
		return driver.getTitle();	
	}
	public void enterCustomerId() {
		customerId.sendKeys("27097");		
	}
	public void selectAccount() {
		Select select = new Select(accountType);
		select.selectByValue("Savings");
	}
	public void initialDeposit() {
		initialDeposit.sendKeys("1000");		
	}
	public void submitBtn() {
		submitBtn.click();
	}
	public String successMessage() {
		return successfulMessage.getText();		
	}

}
