package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.tests.TestBase;
import com.iihs.utilities.Driver;

public class SPA_985_page{
	
	public SPA_985_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	//KK
		@FindBy(xpath="(//div[1]/div[3]/div)[2]")
		public WebElement firstParagraph;
		
		@FindBy(xpath="(//div/a[@data-toggle='dropdown'])[2]")
		public WebElement allFatalityFactsTopics;
		
		@FindBy(xpath = "(//div[@class='dropdown open'])/ul/li[6]")
		public WebElement genderLink;
		
		@FindBy(xpath="//div/div[2]/div[1]/h1")
		public WebElement genderLable;
		
		@FindBy(xpath="(//ul[@class='lawsSubMenu'])/li[2]")
		public WebElement AgeDifferenceLink;
		
		@FindBy(xpath="(//div[@class='fatalityContentTitle'])/h2[.='Age differences']")
		public WebElement ageDifferenceTitle;
		
		@FindBy(xpath="(//th[@class='table-title'])[7]")
		public WebElement tableFloatingHeaderTitle;
		
		@FindBy(xpath="//div[@id='content-wrapper']/div[1]/div[2]/div[5]/div[2]/div[3]/div[10]/table/tbody/tr[1]/td[9]")
		public WebElement age16To19YearsRate;
}
