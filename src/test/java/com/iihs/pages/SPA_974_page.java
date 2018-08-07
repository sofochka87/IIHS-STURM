package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_974_page extends SPA_973_page {

	public SPA_974_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath="//a[@id='A1']")
	public List<WebElement> yearlySnapShotLine;
	
	@FindBy(xpath = "(//table)[4]/tbody/tr")
	public List<WebElement> alcoholInvolvementRows;
	
	@FindBy(xpath = "((//table)[4]/tbody/tr)[47]/td")
	public List<WebElement> alcoholInvolvementVaCols;
	
	@FindBy(xpath = "(//th[@class='table-title'])")
	public List<WebElement> table_titles;
	
	
}
