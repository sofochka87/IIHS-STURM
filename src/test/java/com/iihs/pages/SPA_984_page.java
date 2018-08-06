package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_984_page {
	public SPA_984_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath ="((//ul[@class='dropdown-menu'])[1]/li)[4]")
	public WebElement link2013;
	
	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[1]/tr[2]/th[2]")
	public WebElement DeathsCellTrends;
	
	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[1]/tr[2]/th[3]")
	public WebElement crashesCellTrends;
	
	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[1]/tr[2]/th[4]")
	public WebElement MotorVehiclesCellTrends;
	
	@FindBy(xpath ="(//div[@class='data fatality-table']/table)[1]/tbody/tr[1]/th[1]")
	public WebElement firstYear1975;
	
	@FindBy(xpath ="(//div[@class='data fatality-table']/table)[1]/tbody/tr[39]/th[1]")
	public WebElement laststYear2013;
}
