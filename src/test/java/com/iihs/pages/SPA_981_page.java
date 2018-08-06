package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_981_page {

	public SPA_981_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[2]/li)[12]")
	public WebElement linksOfFactsTopicsStateByState;

	@FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]")
	public WebElement linksOfFactsMenu;

	@FindBy(xpath = "//div[@class='span-20']/h1")
	public WebElement leftAppendHalf;

	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[1]/tr[1]")
	public WebElement tableTitleFatalCrash;
	
	@FindBy(xpath = "(//tr[@class='even'])[1]")
	public List<WebElement> alaskaRow;
}
	
