package com.iihs.tests;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SPA_975 extends MozBase {
	
	@Test(description = "Open browser , Navigate to url")
	public void spa_975_Step1() {
		assertTrue(webElems975.generalStatistics.getText().contains("General statistics"));
	}
	
	@Test(description = "Click All Fatality Facts Topics drop down menu")
	public void spa_975_Step2() {
		webElems975.factsTopics.click();
		expectedList=Arrays.asList("Yearly snapshot","Alcohol","Bicyclists","Children",
				"Collisions with fixed objects and animals","Gender","Large trucks",
				"Motorcycles and ATVs","Older people","Passenger vehicle occupants",
				"Pedestrians","State by state","Teenagers","Urban/rural comparison");
		actualList = new ArrayList();
		for (WebElement webE : webElems975.linksOfFactsTopics) {
			actualList.add(webE.getText());
		}
		assertEquals(actualList,expectedList);
	}
	
	@Test(description = "Select 2011 from Yearly Snapshot in Data subsections")
	public void spa_975_Step3() {
		webElems975.snapshotYears.click();
		webElems975.linksOfSnapshotYears.get(5).click();
		assertFalse(webElems975.firstParagraph.getText().contains("2013"));
		assertEquals(webElems975.snapshotYears.getText(),"2011");
	}
	
	@Test(description = "Select Children from All Fatality Facts Topics drop down menu")
	public void spa_974_Step5() {
		webElems975.snapshotYears.click();
		webElems975.linksOfSnapshotYears.get(5).click();
		webElems975.factsTopics.click();
		webElems975.linksOfFactsTopics.get(3).click();
		expected = "Passenger vehicle occupant deaths among children "
				+ "younger than 13 by seating position, 1975-2011";				
		actual = webElems975.childrenText.getText();
		assertEquals(actual, expected);
	}
	
}
