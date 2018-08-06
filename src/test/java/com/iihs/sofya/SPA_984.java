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
import com.iihs.pages.SPA_984_page;
import com.iihs.tests.TestBase;

public class SPA_984 extends TestBase {

	Fatality_Facts facts = new Fatality_Facts();
	SPA_981_page facts1 = new SPA_981_page();
	SPA_982_page facts2 = new SPA_982_page();
	SPA_983_page facts3 = new SPA_983_page();
	SPA_984_page facts4 = new SPA_984_page();

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

	// Click on year Button and choose 2013
	@Test(description = "click on 2015 from Yearly snapshot drop down menu", priority = 3)
	public void click_on_2014_link() {
		facts.snapshotYears.click();
		facts4.link2013.click();
		assertNotEquals(facts.snapshotYears.getText(), "2014");
	}

	// Click on All Fatality topics and choose Yearly Snapshot
	@Test(description = "Select \"Yearly Snapshot\"", priority = 4)
	public void select_YearlySnapshot() {
		facts.snapshotYears.click();
		facts4.link2013.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		assertTrue(facts1.leftAppendHalf.getText().contains("Yearly snapshot"));
	}

	// Move on Data subsections and click Trends.
	@Test(description = "Move on Data subsections and click Trends", priority = 5)
	public void click_Trends() {
		facts.snapshotYears.click();
		facts4.link2013.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(0).click();
		assertTrue(facts3.tableWhenTheyDied.isDisplayed(),
				"Number of deaths, crashes and motor vehicles in fatal crashes, 1975-2013");
	}

	// Get deaths , crashes , and Motor vehicles datas
	@Test(description = "Get deaths , crashes , and Motor vehicles datas", priority = 5)
	public void verify_deaths_Crashes_MotorVehicles() {
		facts.snapshotYears.click();
		facts4.link2013.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(0).click();
		assertTrue(facts4.DeathsCellTrends.getText().contains("Deaths"));
		assertTrue(facts4.crashesCellTrends.getText().contains("Crashes"));
		assertTrue(facts4.MotorVehiclesCellTrends.getText().contains("Motor vehicles"));
	}

	// Verify that Number of deaths, crashes and motor vehicles in fatal crashes
	// table's
	// only first year is 1975 and only last year is 2013
	@Test(description = "Verify first year is 1975 and only last year is 2013 in Trends", priority = 5)
	public void verify_deaths_Crashes_MotorVehicles_in_Trends() {
		facts.snapshotYears.click();
		facts4.link2013.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(0).click();
		assertTrue(facts4.firstYear1975.getText().contains("1975"));
		assertTrue(facts4.laststYear2013.getText().contains("2013"));
	}

}
