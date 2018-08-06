package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_980_page {
	
	public SPA_980_page() { 
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(xpath = "//div[@class='span-20']/h1")
	public WebElement leftSideDropdown;
	
	@FindBy(xpath = "(//*[contains(text(), 'Trends')])[2]")
	public WebElement trends;
	
	@FindBy(xpath ="(//*[contains(text(), 'Motor vehicle')])[1]")
	public WebElement tableHeader;
	

}
