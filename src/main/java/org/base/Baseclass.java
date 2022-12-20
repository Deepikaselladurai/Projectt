package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
    public static WebDriver BrowserLaunch(String Browsername) {
  	switch (Browsername) {
  	  
case "chrome":
  	  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
case "edge":
		WebDriverManager.edgedriver().setup();
	    driver =  new EdgeDriver();
	    break;

case "firefox":
			WebDriverManager.firefoxdriver().setup();
		    driver =  new FirefoxDriver();
		    break;
    
    }
		return driver;
    }
    
    public static  void urlLaunch(String url) {
		driver.get(url);

	}
    public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
    
    public static void sendkeys(WebElement e, String value) {
	  e.sendKeys(value);

	}
    public static void Click(WebElement e) {
		e.click();
    }
    
    public static void maximize() {
  	  driver.manage().window().maximize();
    }
    
    public static void timeout(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
    public static void close() {
		driver.close();

	}

  public static String get(WebElement e , String Value) {
	   String txt = e.getText();
	   return txt;

	}
  
  public static String getattribute(WebElement e , String Value) {
	   String attribute = e.getAttribute(Value);
	   return attribute;

  }
  

  public static void mouseaction(WebElement e ) {
  	  Actions a = new Actions(driver);
  	   a.moveToElement(e);
  	
  }
  public static Dimension size(WebElement e) {
  	Dimension count = e.getSize();
	    return count;

	}
  
  
  public static void mouse1action(WebElement src , WebElement desc ) {
  Actions a = new Actions(driver);
  a.dragAndDrop(src, desc);
  }
  
  public static void Contextclick(WebElement e) {
  	 Actions a = new Actions(driver);
  	 a.contextClick(e);

	}
  
  
  public static void Doubleclick(WebElement e) {
 	 Actions a = new Actions(driver);
 	 a.doubleClick(e);
  
  }
  
  public static void KeyActions() throws AWTException {
    	 Robot r = new Robot();
    	 r.keyPress(KeyEvent.VK_DOWN);
    	 r.keyPress(KeyEvent.VK_UP);
    	 r.keyRelease(KeyEvent.VK_DOWN);
   	 r.keyRelease(KeyEvent.VK_UP);

	}
  
  public static void SelectByIndex(WebElement dropdown , int index) {
  	Select s = new Select(dropdown);
  	s.selectByIndex(index);
  }
         	
  public static void SelectByValue(WebElement dropdown ,String value) {
  	Select s = new Select(dropdown);
  	s.selectByValue(value);
  }
        
  public static void SelectBYVisibleText(WebElement dropdown ,String visibletext) {
  	Select s = new Select(dropdown);
  	s.selectByVisibleText(visibletext);
  }
  
  
  public static boolean SelectIsMultiple(WebElement dropdown ) {
  	Select s = new Select(dropdown);
  	boolean m = s.isMultiple();
		return m;
  	
  }
//  public static String Getoptions (WebElement dropdown , String opts ) {
//  	Select s = new Select(dropdown);
//      List<WebElement>  opt = s.getOptions();
//     
//      
//      for(int i=0 ; i<=opt.size();i++) {
//      	WebElement opt1 = opt.get(i);
//      	String opts = opt1.getText();
//      	return opts;
//  }
//  }
//      public static String AllGetoptions (WebElement dropdown , String opt1 ) {
//      	Select s = new Select(dropdown);
//          List<WebElement>  option = s.getOptions();

      
     
  

  
  
  
  
  
  
  
  
  


}
