package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_975_MOzPages extends SPA_974_MOzPages {

	public SPA_975_MOzPages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[7]/table/thead[1]/tr[1]/th")
	public WebElement childrenText;

	
}
