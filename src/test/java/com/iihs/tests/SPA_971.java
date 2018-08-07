package com.iihs.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iihs.pages.SPA_971_page;

public class SPA_971 extends TestBase {
	
	SPA_971_page facts = new SPA_971_page();

	@Test(description = "General statistics is displayed", priority = 1)
	public void SPA_971_Step1() {
		
		assertTrue(facts.generalStatistics.isDisplayed(), "General statistics");
	}
	
	@Test(description = "Click on 2010 from Yearly snapshot drop down menu", priority = 2)
	public void SPA_971_Step2() {
		
		facts.snapshotYears.click();
		facts.link2010.click();
		assertTrue(facts.firstParagraph.getText().contains("2010"));
	}
	@Test(description = "Verify 2016 from drop down menu is NOT displayed.", priority = 3)
	public void SPA_971_Step3() {
		
		facts.snapshotYears.click();
		facts.link2010.click();
		String actual= facts.dropDownToggle2010.getText();
		String expected = "2016";
		assertFalse(actual.contains(expected));
		
	}
	@Test(description = "Verify All Fatality Facts Topic drop down menu Children link is displayed", priority = 4)
	public void SPA_971_Step4() {
		facts.factsTopics.click();
		String expected = "Children";
		List<String> actualLinks = new ArrayList<>();
		for (WebElement link : facts.linksOfFactsTopics) {
			actualLinks.add(link.getText());
		}
		assertTrue(actualLinks.contains(expected));
	}
	
	@Test(description = "Children is displayed", priority = 5)
	public void SPA_971_Step5() {
		facts.snapshotYears.click();
		facts.link2010.click();
		facts.factsTopics.click();
		facts.children.click();
		assertTrue(facts.childrenLeftAppend.getText().contains("Children"));
	}
	
	@Test(description = "Click on trend", priority = 6)
	public void SPA_971_Step6() {
		facts.factsTopics.click();
		facts.children.click();
		facts.snapshotYears.click();
		facts.link2010.click();
		facts.trendChildren2010.click();
		assertTrue(facts.trendChildren2010.getText().contains("Trends"));
	}
	
	@Test(description = "Trends table capture 2010 row", priority = 7)
	public void SPA_971_Step7() {
		facts.factsTopics.click();
		facts.children.click();
		facts.snapshotYears.click();
		facts.link2010.click();
		facts.trendTable2010.click();
		assertTrue(facts.trendTable2010.getText().contains("2010 655 68 209 22 36 4 962 100"));
				
	}
	
}
