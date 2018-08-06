package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_970_page extends SPA_969_page {
	
	public SPA_970_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[1]/li)[4]/a")
	public WebElement link2013;

	@FindBy(xpath = "//div[@class='clearfix prepend-top span-17']/ul/li[3]/a")
	public WebElement crashTypes2013;
	
	@FindBy(xpath = "//div[9]/table/thead[1]/tr[1]")
	public WebElement tableTitleCrashTypes2013;
	
	@FindBy(xpath = "//div[@id='content-wrapper']//div[9]/table/tbody/tr[31]/td[1]")
	public WebElement deathsNJ2013;


	
	
	
	
}
