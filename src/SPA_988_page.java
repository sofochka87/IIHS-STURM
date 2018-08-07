package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_988_page extends SPA_987_page {
	
	
	public SPA_988_page(){
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	@FindBy(xpath="(//div/a[@data-toggle='dropdown'])[2]")
	public WebElement allFatalityFactsTopics;
	
	@FindBy(xpath="(//div[@class='span-18 main-content-header'])/h1")
	public WebElement childrenSaftylable;
	
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[4]/a")
	public List<WebElement>ChildrenLink;
	
	@FindBy(xpath="//div[@class='span-20']/h1")
	public WebElement childrenLabel;
		
	@FindBy(xpath="//ul[@class='lawsSubMenu']/li[1]/a")
	public List<WebElement>trendsLink; 
	
	@FindBy(xpath="//h2[.='Fatal crash totals']")
	public WebElement FatalCrashTotalsLabel;
	
	@FindBy(xpath="//h2[.='Trends']")
	public WebElement trendsLabel;
	
	
	
	

	
}
