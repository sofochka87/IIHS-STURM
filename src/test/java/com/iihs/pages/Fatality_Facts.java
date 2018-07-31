package com.iihs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class Fatality_Facts {

	public Fatality_Facts() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='span-18 main-content-header']/h1")
	public WebElement generalStatistics;

	@FindBy(xpath = "//input[@id='SearchButton']")
	public WebElement searchButton;

	@FindBy(xpath = "//ul[@id='NavTabs']/li")
	public List<WebElement> tabMenus;

	@FindBy(xpath = "(//ul[@id='NavTabs']/li)[1]")
	public WebElement yearlySnapshot;

	@FindBy(xpath = "(//ul[@id='NavTabs']/li)[2]")
	public WebElement gender;

	@FindBy(xpath = "(//ul[@id='NavTabs']/li)[3]")
	public WebElement passengerVehicleOccupants;

	@FindBy(xpath = "(//ul[@id='NavTabs']/li)[4]")
	public WebElement stateByState;

	@FindBy(xpath = "(//div[@class='dropdown'])[2]")
	public WebElement factsTopics;

	@FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li")
	public List<WebElement> linksOfFactsTopics;

	@FindBy(xpath = "(//div[@class='dropdown'])[1]")
	public WebElement snapshotYears;

	@FindBy(xpath = "(//ul[@class='dropdown-menu'])[1]/li")
	public List<WebElement> linksOfSnapshotYears;
	
	@FindBy(xpath = "((//ul[@class='dropdown-menu'])[1]/li)[2]")
	public WebElement link2015;
	
	@FindBy(xpath = "//ul[@class='lawsSubMenu']/li")
	public List<WebElement> dataSubsectionsLinks;
	
	@FindBy(xpath = "(//ul[@class='lawsSubMenu']/li)[1]")
	public WebElement linkTrends;
}
