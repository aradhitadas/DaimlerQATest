package com.pages;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {("@TestCase_4DayForcast_API"),("@TestCase_4DayForcast_1")}		
		//glue={"Forcast4DaySteps"}
		)

public class runner {

}
