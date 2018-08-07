package kahar;


import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iihs.pages.Fatality_Facts;

import com.iihs.pages.SPA_986_page;
import com.iihs.tests.TestBase;
import com.iihs.utilities.BrowserUtils;


public class SPA_986_test extends TestBase{
		
  static SPA_986_page spa2=new SPA_986_page();
    
	
	@Test(description="www.iihs.org/iihs/topics/t/"
            + "general-statistics/fatalityfacts/overview-of-fatality-facts")
	public void spa986step1(){
		
	}
	@Test(description="Verify, Page 'Overview, Fatality Facts, News releases and articles,Regulatory and legislative policy'  is loaded")
	public void spa986step2(){
		List<String> expectedElement=Arrays.asList("Overview","Fatality Facts","News releases and articles","Regulatory and legislative policy");	
		
		List<String> actualElement=new ArrayList<>();
		System.out.println(spa2.menuGradientList.get(0).getText());
		for(WebElement actualEach:spa2.menuGradientList){
			
			actualElement.add(actualEach.getText());
			
		}
		Assert.assertEquals(actualElement,expectedElement);
	}
	
	@Test(description="Click on Yearly snapshot dropDown box then select the 2015  and verify that 2015 is displayed")
	public void spa986step3(){
		spa2.YearlyDropDown.click();
		BrowserUtils.waitForClickablility(spa2.Year, 15);
		spa2.Year.click();
		
		Assert.assertTrue(spa2.YearlyDropDown.isDisplayed());
		//System.out.println(spa2.YearlyDropDown.getText().trim());
	}
	
	@Test(description="Click on ALL FATALITY FACTS TOPICS then "
			+ "select the Gender link and Verify that Titles"
			+ " Gender | 2015 is displayed ")
	public void spa986step4(){
		spa2.YearlyDropDown.click();
		BrowserUtils.waitForClickablility(spa2.Year, 15);
		spa2.Year.click();
		BrowserUtils.waitForClickablility(spa2.allFatalityFactsTopics, 15);
		spa2.allFatalityFactsTopics.click();
		BrowserUtils.waitForClickablility(spa2.genderLink, 15);
		spa2.genderLink.click();
		
		Assert.assertTrue(spa2.genderLable.isDisplayed());
		//System.out.println(spa2.genderLable.getText());	
	}
	@Test(description="Move on Data subsections and click on "
			+ " Alcohol Involvement Verify,Alcohol Involvement  "
			+ "is Displayed as a title  ")
	public void spa986step5(){
		spa2.YearlyDropDown.click();
		BrowserUtils.waitForClickablility(spa2.Year, 15);
		spa2.Year.click();
		BrowserUtils.waitForClickablility(spa2.allFatalityFactsTopics, 15);
		spa2.allFatalityFactsTopics.click();
		BrowserUtils.waitForClickablility(spa2.genderLink, 15);
		spa2.genderLink.click();
		BrowserUtils.waitForClickablility(spa2.alkoholInvoLink, 15);
		spa2.alkoholInvoLink.click();
		
		Assert.assertTrue(spa2.alkoholInvoLink.isDisplayed());
		System.out.println(spa2.alkoholInvoLink.getText().trim());
		
	}

	@Test(description="Find 1986th total percentage from "
			+ "alcohol involvement table's graphic "
			+ "which is regarding the car accident and verify it   ")
	public void spa986step6(){
		spa2.YearlyDropDown.click();
		BrowserUtils.waitForClickablility(spa2.Year, 15);
		spa2.Year.click();
		BrowserUtils.waitForClickablility(spa2.allFatalityFactsTopics, 15);
		spa2.allFatalityFactsTopics.click();
		BrowserUtils.waitForClickablility(spa2.genderLink, 15);
		spa2.genderLink.click();
		BrowserUtils.waitForClickablility(spa2.alkoholInvoLink, 15);
		spa2.alkoholInvoLink.click();
		
		String expectedPercentage="51";
		String actualPercentage=spa2.totalPercentage.getText().trim();
		//System.out.println(actualPercentage);
		
		Assert.assertEquals(actualPercentage,expectedPercentage);
		
	}

}
