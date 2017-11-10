package com.demo.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChapterPage2 extends AbstractPage {
	
	public ChapterPage2(WebDriver driver){
		super(driver);
	}
	
	public ChapterPage2 verifyMultipleLineText(){
		WebElement element = driver.findElement(By.id("find"));
		String lines = element.getText();
		Assert.assertTrue(lines.contains("This item div has the id of find\nput find into the target of Selenium IDE\nand click the find button"));
		return new ChapterPage2(driver);
	}
	
	public ChapterPage2 verifyButtons(){
		String value = driver.findElement(By.name("but2")).getAttribute("value");
		Assert.assertTrue(value.equals("Button with name"));
		String value1 = driver.findElement(By.id("random")).getAttribute("value");
		Assert.assertTrue(value1.equals("Random"));
		return new ChapterPage2(driver);		
	}
}
