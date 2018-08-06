package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_978_page {
	public SPA_978_page() { 
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(xpath = "//h1[contains(text(), 'Child safety')]")
	public WebElement childSafety;
	
	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[1]/li)[7]")
	public WebElement link2010;
	
	@FindBy(xpath = "(//*[contains(text(), 'When they died')])[2]")
	public WebElement whenTheyDied;
	
	@FindBy(xpath ="(//table/thead[@class='tableFloatingHeaderOriginal'])[11]/tr[1]")
	public WebElement tableHeader;
	

}
