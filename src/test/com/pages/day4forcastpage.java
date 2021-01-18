package com.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day4forcastpage extends Basepage {
	
	public String hottemp, coldtemp;
	  public day4forcastpage(WebDriver driver) {
	    super(driver);
	  }
	  
	  	  
	  public day4forcastpage checkfor4dayforcast() {
	    WebElement forcast = (new WebDriverWait(driver,10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("page-title")));
	    assertEquals("Forecast", forcast.getText());
	    	   
	    WebElement day4header = (new WebDriverWait(driver, 10))
	    	      .until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("4-Day Outlook")));
	    assertEquals("4-Day Outlook", day4header.getText());
	    
	    WebElement day4table = (new WebDriverWait(driver, 10))
	    	      .until(ExpectedConditions.visibilityOfElementLocated(By.className("table")));
	    int rowcnt = driver.findElements(By.xpath("//*[@class='table']/tbody/tr")).size();
		  //System.out.print(rowcnt);
		 assertTrue(rowcnt!=0);
	    
	    return new day4forcastpage(driver);
	  }
	  public void checkforecasttablecontent() {
		  
		  WebElement day4table = (new WebDriverWait(driver, 10))
	    	      .until(ExpectedConditions.visibilityOfElementLocated(By.className("table")));
		  
		  int rowcnt = driver.findElements(By.xpath("//*[@class='table']/tbody/tr")).size();
		 // List<WebElement> e = driver.findElements(By.xpath("//*[@class='table']/tbody/tr"));
		 // System.out.print(e);
		  assertTrue(rowcnt!=0);
		  
		   hottemp = driver.findElement(By.xpath("(//table/tbody/tr[1]/td[2]/span[1])")).getText();
		   coldtemp = driver.findElement(By.xpath("(//table/tbody/tr[1]/td[2]/span[2])")).getText();
		  
	  }
	  
	}