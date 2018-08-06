package com.iihs.smoke_tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.tests.TestBase;
import com.iihs.utilities.BrowserUtils;
import com.iihs.utilities.Driver;

public class Smoke_Test extends TestBase {

	Fatality_Facts facts = new Fatality_Facts();

	@Test(description = "Verify General Statistics  is displayed", priority = 2)
	public void verify_general_statistic() {
		assertTrue(facts.generalStatistics.isDisplayed(), "General Statistics");
	}

	@Test(description = "Verify Search Button is displayed", priority = 3)
	public void verify_search_button() {
		 assertTrue(facts.searchButton.isDisplayed());
	}
	// Verify main tab menus : Yearly snapshot, Gender, Passenger vehicle occupants,
	// State by state

	@Test(description = "Verify main tab menus is displayed", priority = 4)
	public void verify_tab_menus() {
		BrowserUtils.waitForPageToLoad(30);
		List<String> expectedTabs = Arrays.asList("Yearly snapshot", "Gender", "Passenger vehicle occupants",
				"State by state");
		List<String> actualTabs = new ArrayList<>();
		for (WebElement tab : facts.tabMenus) {
			actualTabs.add(tab.getText());
		}
		assertEquals(actualTabs, expectedTabs);
	}
	// click on Yearly snapshot from tab menu

	@Test(description = "click on Yearly snapshot", priority = 5)
	public void click_on_yearly_snapshot() {
		BrowserUtils.waitForClickablility(facts.yearlySnapshot, 15);
		facts.yearlySnapshot.click();
	}

	// click on Gender from tab menu

	@Test(description = "click on Gender", priority = 6)
	public void click_on_gender() {
		BrowserUtils.waitForClickablility(facts.gender, 15);
		facts.gender.click();
	}
	// click on Passenger vehicle occupants from tab menu
 
	@Test(description = "click on  Passenger vehicle occupants", priority = 7)
	public void click_on_passenger_vehicle_occupants() {
		BrowserUtils.waitForClickablility(facts.passengerVehicleOccupants, 15);
		facts.passengerVehicleOccupants.click();
	}
	// click on State by state from tab menu
 
	@Test(description = "click on  State by state occupants", priority = 8)
	public void click_on_state_by_state() {
		BrowserUtils.waitForClickablility(facts.stateByState, 15);
		facts.stateByState.click();
	}
	// Verify All Fatality Facts Topics drop down menu links are displayed
 
	@Test(description = "Verify All Fatality Facts Topics is displayed", priority = 9)
	public void verify_Fatality_facts_topics_links() {
		BrowserUtils.waitForPageToLoad(30);
		assertTrue(facts.factsTopics.isDisplayed(), "All Fatality Facts Topics");
		BrowserUtils.waitForClickablility(facts.factsTopics, 15);
		facts.factsTopics.click();
		List<String> expectedLinks = Arrays.asList("Yearly snapshot", "Alcohol", "Bicyclists", "Children",
				"Collisions with fixed objects and animals", "Gender", "Large trucks", "Motorcycles and ATVs",
				"Older people", "Passenger vehicle occupants", "Pedestrians", "State by state", "Teenagers",
				"Urban/rural comparison");
		List<String> actualLinks = new ArrayList<>();
		for (WebElement link : facts.linksOfFactsTopics) {
			actualLinks.add(link.getText());
		}
		assertEquals(actualLinks, expectedLinks);

	}
	// Verify All Fatality Yearly snapshot drop down menu links are displayed
  
	@Test(description = "Verify All Fatality Yearly snapshot drop down menu links are displayed", priority = 10)
	public void verify_yearly_snapshot_links() {
		BrowserUtils.waitForPageToLoad(30);
		assertTrue(facts.snapshotYears.isDisplayed(), "2016");
		BrowserUtils.waitForClickablility(facts.snapshotYears, 15);
		facts.snapshotYears.click();
		List<String> expectedYearsLinks = Arrays.asList("2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009",
				"2008", "2007", "2006", "2005");
		List<String> actualYearsLinks = new ArrayList<>();
		for (WebElement yearLink : facts.linksOfSnapshotYears) {
			actualYearsLinks.add(yearLink.getText());
		}
		assertEquals(actualYearsLinks, expectedYearsLinks);
	}
	// click on 2015 from Yearly snapshot drop down menu
 
	@Test(description = "click on 2015 from Yearly snapshot drop down menu", priority = 11)
	public void click_on_2015_link() {
		BrowserUtils.waitForClickablility(facts.snapshotYears, 15);
		facts.snapshotYears.click();
		BrowserUtils.waitForClickablility(facts.link2015, 15);
		facts.link2015.click();
	}
	// Verify Data subsections: Trends , Age and Gender , Safety belt use,
	// Speeding , When they died menu links displayed
 
	@Test(description = "Verify Data subsections links are displayed", priority = 12)
	public void verify_data_subsections() {
		BrowserUtils.waitForPageToLoad(30);
		List<String> expectedDataSubsectionsLinks = Arrays.asList("Trends", "Age and gender", "Safety belt use",
				"Speeding", "When they died");
		List<String> actualDataSubsectionsLinks = new ArrayList<>();
		for (WebElement dataSubsectionsLink : facts.dataSubsectionsLinks) {
			actualDataSubsectionsLinks.add(dataSubsectionsLink.getText());
		}
		assertEquals(actualDataSubsectionsLinks, expectedDataSubsectionsLinks);
	}
	// click on Trends
  
	@Test(description = "click on Trends", priority = 13)
	public void click_on_trends() {
		BrowserUtils.waitForClickablility(facts.linkTrends, 15);
		facts.linkTrends.click();
	}

	// Verify that Trends is title of to top of page
	@Test(description = "Verify that Trends is title", priority = 14)
	public void verify_trends_title() {
		BrowserUtils.waitForClickablility(facts.linkTrends, 15);
		facts.linkTrends.click();
		assertEquals(Driver.getDriver().getTitle(), "Fatality Facts");
	}
}
