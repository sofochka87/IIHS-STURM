package com.iihs.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iihs.pages.SPA_972_page;

public class SPA_972 extends TestBase {
	
	SPA_972_page facts = new SPA_972_page();
	
	@Test(description = "General statistics is displayed", priority = 1)
	public void SPA_972_Step1() {
		
		assertTrue(facts.generalStatistics.isDisplayed(), "General statistics");
	}
	
	@Test(description = "Click on 2012 from Yearly snapshot drop down menu", priority = 2)
	public void SPA_972_Step2() {
		
		facts.snapshotYears.click();
		facts.link2012.click();
		assertTrue(facts.firstParagraph.getText().contains("2012"));
	}
	
	@Test(description = "Verify 2016 from drop down menu is NOT displayed.", priority = 3)
	public void SPA_972_Step3() {
		
		facts.snapshotYears.click();
		facts.link2012.click();
		String actual= facts.dropDownToggle2012.getText();
		String expected = "2010";
		assertFalse(actual.contains(expected));
	}
	
	@Test(description = "Verify All Fatality Facts Topic drop down menu Passenger vehicle occupants link is displayed", priority = 4)
	public void SPA_972_Step4() {
		facts.factsTopics.click();
		String expected = "Passenger vehicle occupants";
		List<String> actualLinks = new ArrayList<>();
		for (WebElement link : facts.linksOfFactsTopics) {
			actualLinks.add(link.getText());
		}
		assertTrue(actualLinks.contains(expected));
	}
	
	@Test(description = "Passenger vehicle occupants", priority = 5)
	public void SPA_972_Step5() {

		facts.factsTopics.click();
		facts.passengerVehicleOccupantsTab.click();
		facts.snapshotYears.click();
		facts.link2012.click();

		assertTrue(facts.passengerVehicleOccupants.getText().contains("Passenger vehicle occupants"));
	}
	
	
	@Test(description = "Passenger vehicle occupant deaths in single-vehicle crashes by impact point and vehicle type, 2012", priority = 5)
	public void SPA_972_Step6() {
		//System.out.println(facts.tableTitleCrashTypes.getText());
		
		facts.factsTopics.click();
		facts.passengerVehicleOccupantsTab.click();
		facts.snapshotYears.click();
		facts.link2012.click();
		facts.crashTypes2012.click();
		assertTrue(facts.tableTitlecrashTypes2012.getText().contains("Passenger vehicle occupant deaths in single-vehicle crashes by impact point and vehicle type, 2012"));		
}
	
	@Test(description = "From Crash types table capture Frontal data row", priority = 7)
	public void SPA_972_Step7() {
		facts.factsTopics.click();
		facts.passengerVehicleOccupantsTab.click();
		facts.snapshotYears.click();
		facts.link2012.click();
		facts.crashTypes2012.click();
		assertTrue(facts.deathsTable2012.getText().contains("3,015 52 1,391 50 1,152 43 5,637 49"));
		
	
		

	}
}
