package com.iihs.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SPA_974 extends MozBase {
	@Test(description = "Site under test is available and testable.")
	public void spa_974_Step1() {
		
	}

	@Test(description = "Navigate to url")
	public void spa_974_Step2() {
		assertTrue(webElems974.generalStatistics.isDisplayed(), "General Statistics");
	}
	
	@Test(description = "Click on State by state tab")
	public void spa_974_Step3() {
		webElems974.yearlySnapShotLine.get(3).click();
		assertTrue(webElems974.genderTag.getText().startsWith("State by state"));
	}
	
	@Test(description = "Click on Alcohol involvement in Data subsections")
	public void spa_974_Step4() {
		webElems974.yearlySnapShotLine.get(3).click();
		webElems974.dataSubsectionsLinks.get(3).click();
		assertTrue(webElems974.dataSubsectionsLinks.get(3).getText().contains("Alcohol"));
		assertTrue(webElems974.fatalityContentTitles.get(3).isDisplayed());
	}
	
	@Test(description = "From Alcohol involvement table capture Virginia data row")
	public void spa_974_Step5() {
		webElems974.yearlySnapShotLine.get(3).click();
		webElems974.dataSubsectionsLinks.get(3).click();
		expected = "397\t355\t89\t120\t30\t";				
		actual = "";
		for (int i = 0; i < webElems974.alcoholInvolvementVaCols.size(); i++) {
			actual=actual+webElems974.alcoholInvolvementVaCols.get(i).getText()+"\t";
		}
		assertTrue(actual.equals(expected));
		expected = "Estimated number and percent of fatally injured passenger vehicle drivers with BAC ≥ 0.08 percent by state, 2016";
		actual = webElems974.table_titles.get(6).getText();
		assertTrue(actual.equals(expected));
	}
	
}
