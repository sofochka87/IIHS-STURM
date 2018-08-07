package com.iihs.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_969_page;
import com.iihs.utilities.BrowserUtils;
import com.iihs.utilities.Driver;

public class SPA_969 extends TestBase {

	SPA_969_page facts = new SPA_969_page();

	@Test(description = "Yearly Snapshot is displayed", priority = 1)
	public void SPA_969_Step1() {
		assertTrue(facts.yearlySnapshotLeftAppend.isDisplayed(), "Yearly Snapshot");
	}

	@Test(description = "click on 2011 from Yearly snapshot drop down menu", priority = 2)
	public void SPA_969_Step2() {
		facts.snapshotYears.click();
		facts.link2011.click();
		assertTrue(facts.firstParagraph.getText().contains("2011"));
	}

	@Test(description = "Verify All Fatality Facts Topic drop down menu Children link is displayed", priority = 3)
	public void SPA_969_Step3() {
		facts.factsTopics.click();
		String expected = "Children";
		List<String> actualLinks = new ArrayList<>();
		for (WebElement link : facts.linksOfFactsTopics) {
			actualLinks.add(link.getText());
		}
		assertTrue(actualLinks.contains(expected));
	}

	@Test(description = "Child Safety is displayed", priority = 4)
	public void SPA_969_Step4() {
		facts.snapshotYears.click();
		facts.link2011.click();
		facts.factsTopics.click();
		facts.children.click();
		assertTrue(facts.childrenSafety.getText().contains("Child safety"));
	}

	@Test(description = "Motor vehicle crash deaths per million children younger than 13 by gender, 2011 is displayed", priority = 5)
	public void SPA_969_Step5() {
		facts.snapshotYears.click();
		facts.link2011.click();
		facts.factsTopics.click();
		facts.children.click();
		assertTrue(facts.tableTitle.getText()
				.contains("Motor vehicle crash deaths per million children younger than 13 by gender, 2011"));
	}

	@Test(description = "Males, Motor vehicle crash deaths per million children younger than 13 by gender, 2011 is displayed", priority = 6)
	public void SPA_969_Step6() {
		facts.snapshotYears.click();
		facts.link2011.click();
		facts.factsTopics.click();
		facts.children.click();
		assertTrue(facts.maleDeaths.getText().contains("494"));
	}

}
