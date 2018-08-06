package vasiliy.tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_979_page;
import com.iihs.tests.TestBase;

public class SPA_979_VZ  extends TestBase{
	
	Fatality_Facts facts = new Fatality_Facts();
	
	SPA_979_page spa_979 = new SPA_979_page();
	
	@Test(description = "General Statistics is displayed", priority = 1)
	public void verify_general_statistic() {
		assertTrue(facts.generalStatistics.isDisplayed(), "General Statistics");
	}
	
	@Test(description = "Select 2012 from Yearly snapshot dropdown menu", priority = 2)
	public void select_2012_in_dropdown() {
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(4).click();
		assertTrue(spa_979.leftSideDropdown.getText().contains("2012"));				
	}
	
	@Test(description = "Select 'Passenger vehicle occupants' from dropdown menu", priority = 3)
	public void select_passenger_vehicle_occupants() {
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(4).click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(9).click();
		assertTrue(spa_979.leftSideDropdown.getText().contains("Passenger vehicle occupants"));
	}
	
	@Test(description = "Select 'Rollover' in Data subsections", priority = 4 )
	public void select_rollover_in_data_subsections() {
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(4).click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(9).click();
		facts.dataSubsectionsLinks.get(4).click();
		assertEquals(spa_979.rollover.getText(), "Rollover");		
	}
	
	@Test(description = "Check table title", priority = 5)
	public void verify_title_of_table_rollover () { 
		String expected = "Passenger vehicle occupant deaths in rollover crashes by impact point and vehicle type, 2012";
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(4).click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(9).click();
		facts.dataSubsectionsLinks.get(4).click();
		assertEquals(spa_979.tableHeader.getText(), expected);
	}
	
	@Test(description = "Verify first row in the table", priority = 6)
	public void verify_first_row_table() {
		facts.snapshotYears.click();
		facts.linksOfSnapshotYears.get(4).click();
		facts.factsTopics.click();
		facts.linksOfFactsTopics.get(9).click();
		facts.dataSubsectionsLinks.get(4).click();
		
		List<String> expectedRow = Arrays.asList("Frontal 1,400 44 754 38 801 35 3,011 40");
        List<String> actualRow = new ArrayList<>();
        spa_979.frontalRow.forEach(cell -> actualRow.add(cell.getText()));
        assertEquals(actualRow, expectedRow);
	}
	

}
