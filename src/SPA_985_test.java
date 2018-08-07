package kahar;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_985_page;
import com.iihs.tests.TestBase;
import com.iihs.utilities.BrowserUtils;

public class SPA_985_test extends TestBase {
	 Fatality_Facts facts = new Fatality_Facts();
	
	 SPA_985_page spa=new SPA_985_page();
		
	public  void methodRunner1(){
		BrowserUtils.waitForClickablility(facts.snapshotYears, 15);
		facts.snapshotYears.click();
		BrowserUtils.waitForClickablility(facts.link2015, 15);
		facts.link2015.click();
	}
	
	public  void methodRunner2(){
		BrowserUtils.waitForClickablility(spa.allFatalityFactsTopics, 15);
    	spa.allFatalityFactsTopics.click();
		BrowserUtils.waitForClickablility(spa.genderLink, 15);
    	spa.genderLink.click();
	}
	
	
	@Test(description="Navigate to:http://www.iihs.org/iihs/topics/t/general-statistics/fatalityfacts/overview-of-fatality-facts")
	public void spa985step1(){
		
	}
    @Test(description="Fatality Facts ---> Yearly snapshot -->Verify that 2015 is selected in the drop down menu")
	public void spa985step2(){
    	methodRunner1();
		BrowserUtils.waitFor(3);
		Assert.assertTrue(spa.firstParagraph.getText().contains("2015"));
	}
    
    @Test(description="After choosing 2015 move to right to click on All Fatality Topic")
    public void spa985step3(){
    	methodRunner1();
		BrowserUtils.waitForClickablility(spa.allFatalityFactsTopics, 15);
    	spa.allFatalityFactsTopics.click();
    	BrowserUtils.waitFor(3);
    	
    	String actualText=facts.linksOfFactsTopics.get(5).getText();
    	Assert.assertEquals(actualText,"Gender");
    }
    @Test(description="Select the Gender option and click it in the All Fatality Facts Topics  dropdown open ")
    public void spa985step4(){
    	methodRunner1();
    	methodRunner2();
//		
    	BrowserUtils.waitFor(3);
    	Assert.assertTrue(spa.genderLable.isDisplayed());
    }
    @Test(description="Click on Age Differences and verify that Age Differences is Displayed under data subsections ")
    public void spa985step5(){
    	methodRunner1();
    	methodRunner2();
//		
		BrowserUtils.waitForClickablility(spa.AgeDifferenceLink, 15);
		spa.AgeDifferenceLink.click();

		Assert.assertTrue(spa.ageDifferenceTitle.isDisplayed());	    	
    }
    @Test(description="Verify that Fatal passenger vehicle crash involvements per 100 million miles traveled by driver age and gender, 2008 is displayed")
    public void spa985step6(){
    	methodRunner1();
    	methodRunner2();
//		
		BrowserUtils.waitForClickablility(spa.AgeDifferenceLink, 15);
		spa.AgeDifferenceLink.click();
		Assert.assertTrue(spa.tableFloatingHeaderTitle.isDisplayed());
    }
    @Test(description="Find rate of total for 16-19 age")
    public void spa985step7(){
    	methodRunner1();
    	methodRunner2();
//    
		BrowserUtils.waitForClickablility(spa.AgeDifferenceLink, 15);
		spa.AgeDifferenceLink.click();
	   	Assert.assertTrue(spa.age16To19YearsRate.isDisplayed());
    
    }
}
