package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SPA_972_page extends SPA_971_page {
	
	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[1]/li)[5]/a")
	public WebElement link2012;
	
	@FindBy(xpath= "//div[5]/div[2]/div[1]/div[1]/div/a")
	public WebElement dropDownToggle2012;
	
	@FindBy(xpath= "//div[5]/div[2]/div[1]")
	public WebElement passengerVehicleOccupants;		
	
	@FindBy(xpath= "//div[2]/div/ul/li[10]/a")
	public WebElement passengerVehicleOccupantsTab;
	
	@FindBy(xpath= "//div[@class='clearfix prepend-top span-17']/ul/li[2]")
	public WebElement crashTypes2012;
	
	@FindBy(xpath="//div[10]/table/thead[1]/tr[1]/th")
	public WebElement tableTitlecrashTypes2012;
	
	@FindBy(xpath= "//div[10]/table/tbody/tr[1]")
	public WebElement deathsTable2012 ;

	
	
}
