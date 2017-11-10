package com.demo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps1 extends AbstractPageStepDefinition {

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown(Scenario scenario) {
		
		 if (scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver)
	                        .getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png"); //stick it in the report
	    }
		driver.close();
	}
	
	//////////////////////////////////// Chapter1 definition
	//////////////////////////////////// //////////////////////////////////////
	@When("^I select  radio button$")
	public void selectRadioButton() throws Throwable {
		getChapterPage1().ClickRadioButton();
	}

	@When("^I select drop down value$")
	public void selectDropDown() throws Throwable {
		getChapterPage1().selectDropdown();
	}

	@When("^I verify page text$")
	public void verifyPageText() throws Throwable {
		getChapterPage1().verifyText();
	}

	@When("^I verify ajax request$")
	public void verifyAjaxRequest() throws Throwable {
		getChapterPage1().verifyAjaxText();
	}

	//////////////////////////////////// Chapter2 definition
	//////////////////////////////////// //////////////////////////////////////

	@When("^I verify multiple line text$")
	public void verifyMultipleLine() throws Throwable {
		getChapterPage2().verifyMultipleLineText();
	}

	@Then("^I verify buttons$")
	public void verifyButton() throws Throwable {
		getChapterPage2().verifyButtons();
	}

}
