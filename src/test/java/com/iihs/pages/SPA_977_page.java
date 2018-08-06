package com.iihs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_977_page {
	
	public SPA_977_page() { 
		PageFactory.initElements(Driver.getDriver(), this);	
	}
	
	@FindBy(xpath ="(//*[contains(text(), 'Alcohol involvement')])[2]")
	public WebElement alcoholInvolvementTable;
	
	@FindBy(xpath ="(//table/thead[@class='tableFloatingHeaderOriginal'])[6]/tr[2]/th[3]")
	public WebElement femaleTabInAlcoholInvolvementTable;
	
	@FindBy(xpath ="(//table/thead[@class='tableFloatingHeaderOriginal'])[6]/tr[2]/th[2]")
	public WebElement maleTabInAlcoholInvolvementTable;
	
	@FindBy(xpath ="(//table/thead[@class='tableFloatingHeaderOriginal'])[6]/tr[2]/th[4]")
	public WebElement totalTabInAlcoholInvolvementTable;
	
	@FindBy(xpath ="(//table/thead[@class='tableFloatingHeaderOriginal'])[6]/tr[1]")
	public WebElement tableHeader;

}
