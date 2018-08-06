package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_979_page {
	
	public SPA_979_page() { 
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	@FindBy(xpath = "//div[@class='span-20']/h1")
	public WebElement leftSideDropdown;
	
	@FindBy(xpath = "(//*[contains(text(), 'Rollover')])[3]")
	public WebElement rollover;
	
	@FindBy(xpath ="(//table/thead[@class='tableFloatingHeaderOriginal'])[19]/tr[1]")
	public WebElement tableHeader;
	
	@FindBy(xpath ="(//div[@class='data fatality-table']/table)[19]/tbody/tr[1]")
	public List<WebElement> frontalRow; 

}
