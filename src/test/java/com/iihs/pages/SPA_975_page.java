package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_975_page extends SPA_974_page {

	public SPA_975_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[7]/table/thead[1]/tr[1]/th")
	public WebElement childrenText;

	
}
