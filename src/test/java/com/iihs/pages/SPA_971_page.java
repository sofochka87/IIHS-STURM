package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_971_page extends SPA_970_page {
	
	public SPA_971_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[1]/li)[7]/a")
	public WebElement link2010;
	
	@FindBy(xpath= "//h1[@class='left append-half ']")
	public WebElement childrenLeftAppend;
	
	@FindBy(xpath= "//div[@class='clearfix prepend-top span-17']/ul/li/a")
	public WebElement trendChildren2010;
	
	@FindBy(xpath= "//table/tbody/tr[36]")
	public WebElement trendTable2010;
	
	@FindBy(xpath= "//div[5]/div[2]/div[1]/div[1]/div/a")
	public WebElement dropDownToggle2010;
	
	
	
}
