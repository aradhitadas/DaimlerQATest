package com.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;				
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import org.openqa.selenium.interactions.Actions;

public class Homepage extends Basepage {
	  public Homepage(WebDriver driver) {
	    super(driver);
	  }
	 
	  public Homepage open4dayforcast() {
				
		WebElement day24forcast = (new WebDriverWait(driver,1000)).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("24-HOUR FORECAST")));
		day24forcast.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;	
		
		WebElement day4forcast = (new WebDriverWait(driver,1000)).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("4-Day Outlook")));
		day4forcast.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	    return new Homepage(driver);
	  }
	}