package com.pages;
 
import org.openqa.selenium.WebDriver;
 
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBElement.GlobalScope;
 
public class Basepage {
  protected WebDriver driver;
  
 
  public Basepage(WebDriver driver) {
    this.driver = driver;
  }
 
  public Homepage navigateTo() {
	  driver.manage().window().maximize() ;
	  driver.navigate().to("http://www.weather.gov.sg/home/");
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
    return new Homepage(driver);
  }
  
  
}