package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_987_page extends SPA_986_page{
	
	public SPA_987_page(){
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	@FindBy(xpath="(//div/a[@data-toggle='dropdown'])[2]")
	public WebElement allFatalityFactsTopics;
	
	@FindBy(xpath="(//ul[@class='dropdown-menu'])[2]/li/a")
	public List<WebElement> FactsMenu;
	
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[12]/a")
	public List<WebElement>stateByStateLink;
	
	@FindBy(xpath="//div[@class='span-20']/h1")
	public WebElement StateByStateLabel;
		
	@FindBy(xpath="//ul[@class='lawsSubMenu']/li[1]/a")
	public List<WebElement>FatalCrashTotalsLink; 
	
	@FindBy(xpath="//h2[.='Fatal crash totals']")
	public WebElement FatalCrashTotalsLabel;
	

	
}
  