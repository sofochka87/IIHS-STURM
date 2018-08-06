package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_973_MOzPages extends Fatality_Facts{

	public SPA_973_MOzPages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[1]/li)[3]")
	public WebElement link2014;
	
	@FindBy(xpath = "(//div/p)[2]")
	public WebElement firstParagraph;
	
	@FindBy(xpath = "//div[@class='dropdown']")
	public WebElement firstDropDown;
	
	@FindBy(xpath = "//div[@class='span-20']/h1")
	public WebElement genderTag;
	
	@FindBy(xpath = "(//div[@class='fatalityContentTitle']/h2)")
	public List<WebElement> fatalityContentTitles;
	
	@FindBy(xpath = "//table")
	public List<WebElement> fatalityContentTables;
	
	@FindBy(xpath = "(//table)[8]/tbody/tr")
	public List<WebElement> speedingFatalityContentRows;
	
	@FindBy(xpath = "((//table)[8]/tbody/tr)[10]/td")
	public List<WebElement> speedingFatalityContentCols;
	
}
