package kahar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_986_page;
import com.iihs.pages.SPA_987_page;
import com.iihs.tests.TestBase;
import com.iihs.utilities.BrowserUtils;

public class SPA_987_test extends TestBase{
	
	static SPA_987_page spa3=new SPA_987_page();
	
	
	@Test(description="www.iihs.org/iihs/topics/t/general-statistics"
			+ "/fatalityfacts/overview-of-fatality-facts")
	public void spa987step1(){
		
	}
		@Test(description="*Verify, ALL FATALITY FACTS TOPICS is displayed and it has 14 options")
	public void spa987step2(){
			spa3.allFatalityFactsTopics.click();
			
			List<String> expectedElement=Arrays.asList("Yearly snapshot","Alcohol","Bicyclists","Children",
					"Collisions with fixed objects and animals","Gender",
					"Large trucks","Motorcycles and ATVs","Older people",
					"Passenger vehicle occupants","Pedestrians","State by state","Teenagers","Urban/rural comparison");
			List<String> actualElement=new ArrayList<>();
			System.out.println(spa3.FactsMenu.get(0).getText());
			for(WebElement actualEach:spa3.FactsMenu){
				
				actualElement.add(actualEach.getText());
				
			}
			Assert.assertEquals(actualElement,expectedElement);
			//System.out.println(actualElement);			
	}
		
		
		@Test(description="Click on ALL FATALITY FACTS TOPICS  then select 'State by State'link and click it")
		public void spa987step3() {
			
           
			spa3.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa3.stateByStateLink, 15);
			spa3.stateByStateLink.get(0).click();
			
		}
		@Test(description="*Verify,State by State is Displayed on the page")
		public void spa987step4(){
			
			spa3.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa3.stateByStateLink, 15);
			spa3.stateByStateLink.get(0).click();
			
			String actual=spa3.StateByStateLabel.getText().trim();
			
			Assert.assertTrue(spa3.StateByStateLabel.isDisplayed());			
			//System.out.println(actual);
		}
		@Test(description=" Move on Data subsections and click on  Fatal Crash Totals")
		public void spa987step5(){
			spa3.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa3.stateByStateLink, 15);
			spa3.stateByStateLink.get(0).click();
			BrowserUtils.waitForClickablility(spa3.FatalCrashTotalsLink, 15);
			spa3.FatalCrashTotalsLink.get(0).click();
						
		}
		@Test(description=" *Verify, Fatal Crash Totals is Displayed as a title")
		public void spa987step6(){
			spa3.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa3.stateByStateLink, 15);
			spa3.stateByStateLink.get(0).click();
			BrowserUtils.waitForClickablility(spa3.FatalCrashTotalsLink, 15);
			spa3.FatalCrashTotalsLink.get(0).click();
			
			Assert.assertTrue(spa3.StateByStateLabel.isDisplayed());
			
		}

}
