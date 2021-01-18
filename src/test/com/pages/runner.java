package com.pages;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@4_day_weather_forecast"}		
		//glue={"Forcast4DaySteps"}
		)

public class runner {

}
