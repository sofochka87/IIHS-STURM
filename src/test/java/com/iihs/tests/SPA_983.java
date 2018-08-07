package com.iihs.tests;

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

public class SPA_983 extends TestBase {

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

	// Click on year Button and choose 2015
	@Test(description = "click on 2015 from Yearly snapshot drop down menu", priority = 3)
	public void click_on_2015_link() {
		facts.snapshotYears.click();
		facts.link2015.click();
		assertNotEquals(facts.snapshotYears.getText(), "2013");
	}

	// Click on All Fatality topics and choose Yearly Snapshot
	@Test(description = "Select \"Yearly Snapshot\"", priority = 4)
	public void select_YearlySnapshot() {
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		assertTrue(facts1.leftAppendHalf.getText().contains("Yearly snapshot"));
	}

	// Move on Data subsections and click When They Died.
	@Test(description = "click When They Died", priority = 5)
	public void click_on_WhenTheyDied() {
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(4).click();
		assertTrue(facts3.tableWhenTheyDied.isDisplayed(), "Motor vehicle crash deaths by month, 2015");
	}

	// Verify that Deaths and Percents are displayed
	@Test(description = "Verify that Deaths and Percents are displayed", priority = 6)
	public void Verify_DeathsPercents() {
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(4).click();
		assertTrue(facts3.DeathsCellMonthly.getText().contains("Deaths"));
		assertTrue(facts3.percentCellMonthly.getText().contains("%"));
	}

	// Verify that total percentage of each month equals to sum of the months
	// percentages
	@Test(description = "verify total percentage of each month", priority = 7)
	public void verify_total_percentage_of_month() {
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(0).click();
		facts.dataSubsectionsLinks.get(4).click();

		int actualTotalPercentByMonth = facts3.sumOfPercent();
		int expectedTotalPercentByMonth = Integer.valueOf(facts3.percentTotalMonthly.getText());

		System.out.println(actualTotalPercentByMonth);
		assertNotEquals(actualTotalPercentByMonth, expectedTotalPercentByMonth);
	}

}
