package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_969_page extends Fatality_Facts {
	
	public SPA_969_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[@class='left append-half ']")
	public WebElement yearlySnapshotLeftAppend;
	
	@FindBy(xpath = "(//div[@class='dropdown'])[1]")
	public WebElement snapshotYears;
	
	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[1]/li)[6]")
	public WebElement link2011;
	
	@FindBy(xpath="//div[@class='xhtml-content'][1]")
	public WebElement firstParagraph;
	
	@FindBy(xpath = "(//div[@class='dropdown'])[2]")
	public WebElement factsTopics;
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li")
	public List<WebElement> linksOfFactsTopics;
	
	@FindBy(xpath = "//div[@class='dropdown open']/ul/li[4]/a")
	public WebElement children;
	
	@FindBy(xpath = "//div[@class='span-18 main-content-header']/h1")
	public WebElement childrenSafety;
	
	@FindBy(xpath="(//div[@class='data fatality-table']/table/thead/tr/th[@class='table-title'])[13]")
	public WebElement tableTitle;
	
	@FindBy(xpath="//div[16]//tbody/tr[1]/td[2]")
	public WebElement maleDeaths;
	

}
