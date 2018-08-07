package kahar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_987_page;
import com.iihs.pages.SPA_988_page;
import com.iihs.tests.TestBase;
import com.iihs.utilities.BrowserUtils;

public class SPA_988_test extends TestBase {
	
static Fatality_Facts facts = new Fatality_Facts();
	
	SPA_988_page spa4=new SPA_988_page();
	
	
	@Test(description="www.iihs.org/iihs/topics/t/general-statistics"
			+ "/fatalityfacts/overview-of-fatality-facts")
	public void spa987step1(){
		
	}
				
		@Test(description="Click on ALL FATALITY FACTS TOPICS then Choose'Children'")
		public void spa988step2() {
			          
			spa4.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa4.stateByStateLink, 15);
			spa4.ChildrenLink.get(0).click();
			
		}
		@Test(description="*Verify that children is displayed")
		public void spa988step3(){
			
			spa4.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa4.stateByStateLink, 15);
			spa4.ChildrenLink.get(0).click();
					
			Assert.assertTrue(spa4.childrenLabel.isDisplayed());		
			
		}
		@Test(description="Verify that Title 'Child safety'is displayed on the top of the page")
		public void spa988step4(){
			spa4.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa4.stateByStateLink, 15);
			spa4.ChildrenLink.get(0).click();
			
			Assert.assertTrue(spa4.childrenSaftylable.isDisplayed());
						
		}
		@Test(description=" Move on Data subsections and click on  Trends")
		public void spa988step5(){
			spa4.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa4.stateByStateLink, 15);
			spa4.ChildrenLink.get(0).click();
			BrowserUtils.waitForClickablility(spa4.trendsLink, 15);
			spa4.trendsLink.get(0).click();

		}
		@Test(description="*Verify that Trends is displayed as a title")
		public void spa988step6(){
			spa4.allFatalityFactsTopics.click();
			BrowserUtils.waitForClickablility(spa4.stateByStateLink, 15);
			spa4.ChildrenLink.get(0).click();
			BrowserUtils.waitForClickablility(spa4.trendsLink, 15);
			spa4.trendsLink.get(0).click();
			
			Assert.assertTrue(spa4.trendsLabel.isDisplayed());

		}
		

}


