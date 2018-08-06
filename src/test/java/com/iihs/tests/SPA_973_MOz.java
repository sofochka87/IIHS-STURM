package com.iihs.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.utilities.BrowserUtils;
import com.iihs.utilities.Driver;

public class SPA_973_MOz extends MozBase {

	@Test(description = "Site under test is available and testable.")
	public void spa_973_Step1() {
		
	}

	@Test(description = "Navigate to url")
	public void spa_973_Step2() {
		assertTrue(webElems973.generalStatistics.isDisplayed(), "General Statistics");
	}
	
	@Test(description = "Select 2014 from Yearly Snapshot dropdown menu")
	public void spa_973_Step3() {
		webElems973.firstDropDown.click();
		webElems973.link2014.click();
		assertFalse(webElems973.firstParagraph.getText().contains("2015"));
	}
	
	@Test(description = "Select Gender from All Fatality Fact Topics dropdown menu")
	public void spa_973_Step4() {
		webElems973.factsTopics.click();
		webElems973.linksOfFactsTopics.get(5).click();
		assertTrue(webElems973.genderTag.getText().startsWith("Gender"));
	}
	
	@Test(description = "Click on Speeding in Data subsections")
	public void spa_973_Step5() {
		webElems973.dataSubsectionsLinks.get(3).click();
		assertTrue(webElems973.fatalityContentTitles.get(3).isDisplayed());
	}
	
	@Test(description = "From Speeding table capture 2014 data row")
	public void spa_973_Step6() {
		expected = "9,262\t28\t23,413\t72\t32,675\t";				
		actual = "";
		webElems973.firstDropDown.click();
		webElems973.link2014.click();
		for (int i = 0; i < webElems973.speedingFatalityContentCols.size(); i++) {
			actual=actual+webElems973.speedingFatalityContentCols.get(i).getText()+"\t";
		}
		assertTrue(actual.equals(expected));
	}
	
	@Test(description = "Verify Percentage of fatally injured male and female drivers who were coded as speeding, 1982-2014 is Displayed at the top of table")
	public void spa_973_Step7() {
		expected = "69,68,68,69,69,68,69,69,71,72,";				
		actual = "";
		webElems973.firstDropDown.click();
		webElems973.link2014.click();
		for (int i = 0; i < webElems973.speedingFatalityContentRows.size(); i++) {
			actual=actual+(webElems973.speedingFatalityContentRows.get(i).getText().split(" "))[4].toString()+",";
		} 
		assertTrue(actual.equals(expected));
	}
	
}
