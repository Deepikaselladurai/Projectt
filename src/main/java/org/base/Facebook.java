package org.base;

import org.base.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends Baseclass {
	public static void main(String[] args) {
		
		BrowserLaunch("chrome");

		urlLaunch("https://www.facebook.com/");
	    maximize();
		timeout(5);
		
		CreateAccount c = new CreateAccount();
		
	    Click(c.getLogin());
	    
	    sendkeys(c.getFname(),"Deepika");
	    
	    sendkeys(c.getLname(),"Selladurai");
	    
	    sendkeys(c.getPhno(),"8985659444");
	    
	    Click(c.getSignup());
		
	}


	}


