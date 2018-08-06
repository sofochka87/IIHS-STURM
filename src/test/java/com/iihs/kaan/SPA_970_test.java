package com.iihs.kaan;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iihs.pages.SPA_970_page;
import com.iihs.tests.TestBase;

public class SPA_970_test extends TestBase {
	
	SPA_970_page facts = new SPA_970_page();

	@Test(description = "Yearly Snapshot is displayed", priority = 1)
	public void SPA_970_Step1() {
		
		assertTrue(facts.yearlySnapshotLeftAppend.isDisplayed(), "Yearly Snapshot");
	}
	
	@Test(description = "click on 2013 from Yearly snapshot drop down menu", priority = 2)
	public void SPA_970_Step2() {
		
		facts.snapshotYears.click();
		facts.link2013.click();
		assertTrue(facts.firstParagraph.getText().contains("2013"));
	}
	
	@Test(description = "Verify All Fatality Facts Topic drop down menu State by state link is displayed", priority = 3)
	public void SPA_970_Step3() {
		
		facts.factsTopics.click();
		String expected = "State by state";
		List<String> actualLinks = new ArrayList<>();
		for (WebElement link : facts.linksOfFactsTopics) {
			actualLinks.add(link.getText());
		}
		assertTrue(actualLinks.contains(expected));
	}
	
	@Test(description = "State by state is displayed", priority = 4)
	public void SPA_970_Step4() {
		
		facts.snapshotYears.click();
		facts.link2013.click();
		facts.factsTopics.click();
		facts.stateByState.click();
		assertTrue(facts.stateByState.getText().contains("State by state"));
	}
	
	@Test(description = "Deaths by crash type and state, 2013", priority = 5)
	public void SPA_970_Step5() {
		//System.out.println(facts.tableTitleCrashTypes.getText());
		
		facts.factsTopics.click();
		facts.stateByState.click();
		facts.snapshotYears.click();
		facts.link2013.click(); 
		facts.crashTypes2013.click();
		assertTrue(facts.tableTitleCrashTypes2013.getText().contains("Deaths by crash type and state, 2013"));		
	}
	
	@Test(description = "New Jersey, Single Vehicle Number 308 is displayed", priority = 6)
	public void SPA_970_Step6() {
		
		facts.factsTopics.click();
		facts.stateByState.click();
		facts.snapshotYears.click();
		facts.link2013.click(); 
		facts.crashTypes2013.click();
		assertTrue(facts.deathsNJ2013.getText().contains("308"));
	}
}
