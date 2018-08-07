package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_986_page{
	
	public SPA_986_page(){
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath="(//div[@class='level-one-menu gradient'])/ul/li[@class!='disabled']/a")
	public List<WebElement> menuGradientList;

	@FindBy(xpath="(//div/a[@data-toggle='dropdown'])[1]")
	public WebElement YearlyDropDown;
	
	@FindBy(xpath="(//div[@class='dropdown open'])/ul/li[2]/a")
	public WebElement Year;
	
	@FindBy(xpath="(//div/a[@data-toggle='dropdown'])[2]")
	public WebElement allFatalityFactsTopics;
	
	@FindBy(xpath = "(//div[@class='dropdown open'])/ul/li[6]")
	public WebElement genderLink;
	
	@FindBy(xpath="//div/div[2]/div[1]/h1")
	public WebElement genderLable;
	
	@FindBy(xpath="(//div[@class='fatalityContentTitle'])/h2[.='Alcohol involvement']")
	public WebElement alkoholInvoLink;
	@FindBy(xpath="(//table)[6]/tbody/tr[1]/td[9]")
	public WebElement totalPercentage;
}
