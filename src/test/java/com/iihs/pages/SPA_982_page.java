package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_982_page {

	public SPA_982_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath ="((//ul[@class='dropdown-menu'])[1]/li)[3]")
	public WebElement link2014;
	
	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[7]/tr[2]/th[2]")
	public WebElement driverCell;
	
	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[7]/tr[2]/th[3]")
	public WebElement passengerCell;
	
	@FindBy(xpath ="(//div[@class='data fatality-table']/table)[7]/tbody/tr[1]/th[1]")
	public WebElement firstYear1995;
	
	@FindBy(xpath ="(//div[@class='data fatality-table']/table)[7]/tbody/tr[20]/th[1]")
	public WebElement laststYear2014;
}
