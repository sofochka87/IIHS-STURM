package com.iihs.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_977_page;


public class SPA_977 extends TestBase {

	Fatality_Facts facts = new Fatality_Facts();

	SPA_977_page elements = new SPA_977_page();

	@Test(description = "General Statistics is displayed", priority = 1)
	public void verify_general_statistic() {
		assertTrue(facts.generalStatistics.isDisplayed(), "General Statistics");
	}

	@Test(description = "Select Gender All Fatality Topics menu", priority = 2)
	public void select_gender_in_fatality_topics() {
		facts.gender.click();
		assertEquals(facts.gender.getText(), "Gender");
	}

	@Test(description = "Select 2015 from Yearly Snapshot dropdown menu", priority = 3)
	public void select_2015_in_dropdown() {	
		facts.gender.click();
		facts.snapshotYears.click();
		facts.link2015.click();
		assertEquals(facts.snapshotYears.getText(), "2015");
	}

	@Test(description = "Select Alcohol Involvement in Data subsections", priority = 4)
	public void select_alcohol_involvement() {
		facts.gender.click();
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.dataSubsectionsLinks.get(2).click();
		assertEquals(elements.alcoholInvolvementTable.getText(), "Alcohol involvement");
	}

	@Test(description = "Estimated percent of crashes by gender Female", priority = 5)
	public void estimated_crashes_percentage_by_female_gender() {
		facts.gender.click();
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.dataSubsectionsLinks.get(2).click();
		assertEquals(elements.femaleTabInAlcoholInvolvementTable.getText(), "Female");
	}

	@Test(description = "Estimated percent of crashes by gender Male", priority = 6)
	public void estimated_crashes_percentage_by_male_gender() {
		facts.gender.click();
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.dataSubsectionsLinks.get(2).click();
		assertEquals(elements.maleTabInAlcoholInvolvementTable.getText(), "Male");
	}

	@Test(description = "Estimated percent of crashes total", priority = 7)
	public void estimated_crashes_percentage_total() {
		facts.gender.click();
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.dataSubsectionsLinks.get(2).click();
		assertEquals(elements.totalTabInAlcoholInvolvementTable.getText(), "Total*");
	}

	@Test(description = "Check table title ", priority = 8)
	public void verify_title_of_table() {
		String expected = "Estimated number and percent of fatally injured passenger vehicle drivers with BACs ≥ 0.08 percent, 1982-2015";
		facts.gender.click();
		facts.snapshotYears.click();
		facts.link2015.click();
		facts.dataSubsectionsLinks.get(2).click();
		assertEquals(elements.tableHeader.getText(), expected);
	}
}
