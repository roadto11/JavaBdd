package com.demo.test;

import org.openqa.selenium.WebDriver;
import com.demo.pageobject.ChapterPage1;
import com.demo.pageobject.ChapterPage2;
import com.demo.pageobject.HomePage;

public class AbstractPageStepDefinition {	
	
	protected static WebDriver driver;
	// WebDriver driver = null;
	protected static HomePage homePage;
	protected static ChapterPage1 chapterPage1;
	protected static ChapterPage2 chapterPage2;
		
	protected HomePage getHomePage(){
		if ( homePage == null){
			homePage = new HomePage(driver);
		}
		return homePage;		
	}
	
	protected ChapterPage1 getChapterPage1(){
		if ( chapterPage1 == null){
			chapterPage1 = new ChapterPage1(driver);
		}
		return chapterPage1;		
	}
	
	protected ChapterPage2 getChapterPage2(){
		if ( chapterPage2 == null){
			chapterPage2 = new ChapterPage2(driver);
		}
		return chapterPage2;		
	}

}
