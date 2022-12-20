package org.base;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends Baseclass {
	
	public CreateAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement login;
	
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement phno;
	
	@FindBy(name="websubmit")
	private WebElement signup;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public  WebElement getPhno() {
		return phno;
	}
 
	public WebElement getSignup() {
		return signup;
	}

	

	
	
	
	
	
	
	
	
	
	
}
      