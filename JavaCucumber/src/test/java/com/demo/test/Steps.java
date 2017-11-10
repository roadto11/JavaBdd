package com.demo.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps extends AbstractPageStepDefinition {

	//////////////////////////////////// HomePageStepDefinition
	@Given("^I am on the home page$")
	public void NavigateToHomePage() throws Throwable {
		getHomePage().navigateUrl();
		System.out.println("Executed navigation");
	}

	@When("^I am on chapter first page$")
	public void clickOnChapter1() throws Throwable {
		getHomePage().clickChapter1();
	}

	@When("^I am on chapter Second page$")
	public void clickOnChapter2() throws Throwable {
		getHomePage().clickChapter2();
	}

	@When("^I am on chapter Third page$")
	public void clickOnChapter3() throws Throwable {
		//getHomePage().clickChapter3();
	}

}
