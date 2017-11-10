package com.demo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	
	public HomePage navigateUrl(){
		driver.navigate().to("http://book.theautomatedtester.co.uk");
		return  this;		
	}
	
	
	public ChapterPage1 clickChapter1(){
		driver.findElement(By.xpath("//*[text()='Chapter1']")).click();
		return new ChapterPage1(driver);		
	}
	
	
	public ChapterPage2 clickChapter2(){
		driver.findElement(By.xpath("//*[text()='Chapter2']")).click();
		return new ChapterPage2(driver);		
	}
	
/*	public ChapterPage3 clickChapter3(){
		driver.findElement(By.xpath("//*[text()='Chapter3']")).click();
		return new ChapterPage3(driver);		
	}*/
		
}
