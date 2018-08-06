package vasiliy.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_980_page;
import com.iihs.tests.TestBase;

public class SPA_980_VZ extends TestBase{

	Fatality_Facts facts = new Fatality_Facts();

	SPA_980_page spa_980 = new SPA_980_page();
	
	@Test(description = "General Statistics is displayed", priority = 1)
	public void verify_general_statistic() {
		assertTrue(facts.generalStatistics.isDisplayed(), "General Statistics");
	}
	
	@Test(description = "Select 2014 from Yearly snapshot dropdown menu", priority = 2)
	public void select_2014_in_dropdown() {
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(2).click();
		assertTrue(spa_980.leftSideDropdown.getText().contains("2014"));				
	}
	
	@Test(description = "Select 'Gender' from dropdown menu", priority = 3)
	public void select_gender_in_dropdown() {
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(2).click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(5).click();
		assertTrue(spa_980.leftSideDropdown.getText().contains("Gender"));
	}
	
	@Test(description = "Select 'Trends' in Data subsections", priority = 4 )
	public void select_trends_in_data_subsections() {
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(2).click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(5).click();
		facts.dataSubsectionsLinks.get(0).click();
		assertEquals(spa_980.trends.getText(), "Trends");
	}
	
	@Test(description = "Check table title", priority = 5)
	public void verify_title_of_table_trends () { 
		String expected = "Motor vehicle crash deaths by gender, 1975-2014";
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(2).click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(5).click();
		facts.dataSubsectionsLinks.get(0).click();
		assertEquals(spa_980.tableHeader.getText(), expected);
	}
	
	
	
	
	

}
