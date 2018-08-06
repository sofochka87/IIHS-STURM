package com.iihs.sofya;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_981_page;
import com.iihs.pages.SPA_982_page;
import com.iihs.pages.SPA_983_page;
import com.iihs.tests.TestBase;

public class SPA_982 extends TestBase {

	Fatality_Facts facts = new Fatality_Facts();
	SPA_981_page facts1 = new SPA_981_page();
	SPA_982_page facts2 = new SPA_982_page();
	SPA_983_page facts3 = new SPA_983_page();

	// Verify that the title "General Statistics" is displayed
	@Test(description = "Verify General Statistics  is displayed", priority = 1)
	public void verify_general_statistic() {
		assertTrue(facts.generalStatistics.isDisplayed(), "General Statistics");
	}

	// Verify main tab menus : Yearly snapshot, Gender, Passenger vehicle occupants,
	// State by state
	@Test(description = "Verify main tab menus is displayed", priority = 2)
	public void verify_tab_menus() {
		List<String> expectedTabs = Arrays.asList("Yearly snapshot", "Gender", "Passenger vehicle occupants",
				"State by state");
		List<String> actualTabs = new ArrayList<>();
		for (WebElement tab : facts.tabMenus) {
			actualTabs.add(tab.getText());
		}
		assertEquals(actualTabs, expectedTabs);
	}

	// Click on year Button and choose 2014
	@Test(description = "click on 2015 from Yearly snapshot drop down menu", priority = 3)
	public void click_on_2014_link() {
		facts.snapshotYears.click();
		facts2.link2014.click();
		assertNotEquals(facts.snapshotYears.getText(), "2016");
	}

	// Click on All Fatality topics and choose Yearly Snapshot
	@Test(description = "Select \"Yearly Snapshot\"", priority = 4)
	public void select_YearlySnapshot() {
		facts.snapshotYears.click();
		facts2.link2014.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		assertTrue(facts1.leftAppendHalf.getText().contains("Yearly snapshot"));
	}

	// Move on Data subsections and click Safety Belt Use.
	@Test(description = "click Safety Belt Use", priority = 5)
	public void click_on_SafetyBeltUse() {
		facts.snapshotYears.click();
		facts2.link2014.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(2).click();
		assertTrue(facts3.tableWhenTheyDied.isDisplayed(),
				"Safety belt use among fatally injured passenger vehicle occupants 13 and older by seating position, 1995-2014");
	}

	// Verify that Passenger and Driver are displayed
	@Test(description = "Verify that Passenger and Driver are displayed", priority = 6)
	public void Verify_PassengerDriver() {
		facts.snapshotYears.click();
		facts2.link2014.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(2).click();
		assertTrue(facts2.driverCell.getText().contains("Driver"));
		assertTrue(facts2.passengerCell.getText().contains("Passenger"));
	}

	// Verify that "Safety belt use among fatally injured passenger vehicle
	// occupants 13 and older by seating position,
	// 1995-2014" tables only first year is 1995 and only last year is 2014
	@Test(description = "Verify first year is 1995 and only last year is 2014 in Safety Belt Use", priority = 7)
	public void Verify_firstYear_lastYear_SafetyBeltUse() {
		facts.snapshotYears.click();
		facts2.link2014.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(2).click();
		assertTrue(facts2.firstYear1995.getText().contains("1995"));
		assertTrue(facts2.laststYear2014.getText().contains("2014"));
	}

}
