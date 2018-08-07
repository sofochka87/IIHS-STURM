package com.iihs.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_981_page;

public class SPA_981 extends TestBase {

	Fatality_Facts facts = new Fatality_Facts();
	SPA_981_page facts1 = new SPA_981_page();

	// Verify that the title "General Statistics" is displayed
	@Test(description = "Verify General Statistics  is displayed", priority = 1)
	public void verify_general_statistic() {
		assertTrue(facts.generalStatistics.isDisplayed(), "General Statistics");
	}

	// Verify 2016 from "Yearly Snapshot" dropdown menu is selected.
	@Test(description = "Verify 2016 is selected", priority = 2)
	public void verify_2016_is_selected() {
		assertEquals(facts.snapshotYears.getText(), "2016");
	}

	// Select "State by State" from "All Fatality Facts Topics" dropdown menu
	@Test(description = "Select \"State by State\"", priority = 3)
	public void select_stateByState() throws Exception {
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(11).click();
		assertTrue(facts1.leftAppendHalf.getText().contains("State by state"));
	}

	// Click on "Fatal Crash Totals" in "Data subsections" subtitle
	// to scroll down the page to part with the subtitle "Fatal Crash Totals".
	@Test(description = "Click on \"Fatal Crash Totals\"", priority = 4)
	public void click_FatalCrashTotals() {
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(11).click();
		facts.dataSubsectionsLinks.get(0).click();
		facts1.tableTitleFatalCrash.getText();
	}

	// From "Population, fatal motor vehicle crashes, motor vehicle crash deaths and
	// motor vehicle crash death rates per state, 2016" table capture "Alaska" data
	// row
	// Verify that "Alaska" row data is "741894, 5030, 78, 84, 11.3, 1.67".
	@Test(description = "Capture \"Alaska\" data row", priority = 5)
	public void capture_Alaska_data_row() {
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(11).click();
		facts.dataSubsectionsLinks.get(0).click();
		List<String> expectedRow = Arrays.asList("Alaska 741,894 5,030 78 84 11.3 1.67");
		List<String> actualRow = new ArrayList<>();
		facts1.alaskaRow.forEach(cell -> actualRow.add(cell.getText()));
		assertEquals(actualRow, expectedRow);
	}

}
