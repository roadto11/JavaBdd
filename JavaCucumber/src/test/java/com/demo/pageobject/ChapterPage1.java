package com.demo.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class ChapterPage1 extends AbstractPage {
	
	public ChapterPage1(WebDriver driver){
		super(driver);
	}
	
	public ChapterPage1 ClickRadioButton(){
		WebElement element = driver.findElement(By.id("radiobutton"));
		element.click();	
		return this;
	}
	
	public ChapterPage1 verifyText(){
		WebElement element = driver.findElement(By.id("divontheleft"));
		String text = element.getText();
		Assert.assertTrue(text.equals("Assert that this text is on the page"));
		return this;	
	}
	
	
	public ChapterPage1 selectDropdown(){
		Select select = new Select(driver.findElement(By.id("selecttype")));
		select.selectByVisibleText("Selenium RC");		
		return this;		
	}
	
	public void verifyAjaxText(){
		driver.findElement(By.id("secondajaxbutton")).click();
		String text = driver.findElement(By.xpath("//div[@id='html5div']/div")).getText();
		Assert.assertTrue(text.contains("I have been added with a timeout"));		
	}
	
	public void verifyButton(){
		String attribute = driver.findElement(By.id("verifybutton")).getAttribute("value");
		Assert.assertTrue(attribute.contains("Verify this button he here"));
	}
	
}
