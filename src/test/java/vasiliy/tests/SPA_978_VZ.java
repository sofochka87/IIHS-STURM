package vasiliy.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_978_page;
import com.iihs.tests.TestBase;

public class SPA_978_VZ extends TestBase {
	
	Fatality_Facts facts = new Fatality_Facts();
	
	SPA_978_page spa_978 = new SPA_978_page();

	@Test(description = "General Statistics is displayed", priority = 1)
	public void verify_general_statistic() {
		assertTrue(facts.generalStatistics.isDisplayed(), "General Statistics");
	}
	
	@Test(description = "Child safety topic is selected and displayed", priority = 2)
	public void select_child_safety_in_dropdown() {
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(3).click();
		assertEquals(spa_978.childSafety.getText(), "Child safety");		
	}
	
	@Test(description = "Select 2010 from Children dropdown menu", priority = 3)
	public void select_2010_in_dropdown() {
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(3).click();
		facts.snapshotYears.click();
		spa_978.link2010.click();
		assertEquals(facts.snapshotYears.getText(), "2010");
	}
	
	@Test(description = "Select 'When they died' in Data subsections", priority = 4)
	public void select_when_they_died() {
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(3).click();
		facts.snapshotYears.click();
		spa_978.link2010.click();
		facts.dataSubsectionsLinks.get(3).click();
		assertEquals(spa_978.whenTheyDied.getText(), "When they died");
	}
	
	@Test(description = "Check table title", priority = 5)
	public void verify_title_of_table_when_they_died () { 
		String expected = "Motor vehicle crash deaths among children younger than 13 by day of week, 2010";
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(3).click();
		facts.snapshotYears.click();
		spa_978.link2010.click();
		facts.dataSubsectionsLinks.get(3).click();
		assertEquals(spa_978.tableHeader.getText(), expected);
	}

}
