package com.iihs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iihs.utilities.Driver;

public class SPA_983_page {
	
	public SPA_983_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//th[@class='table-title'])[21]")
	public WebElement tableWhenTheyDied;
	
	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[11]/tr[2]/th[2]")
	public WebElement DeathsCellMonthly;
	
	@FindBy(xpath = "(//table/thead[@class='tableFloatingHeaderOriginal'])[11]/tr[2]/th[3]")
	public WebElement percentCellMonthly;
	
	@FindBy(xpath = "(//div[@class='data fatality-table']/table)[11]/tbody/tr[13]/td[2]")
	public WebElement percentTotalMonthly;

	
	public int sumOfPercent() {
		 List<Integer> percentEachMonth = new ArrayList<>();
		 int sum =0;
	    	for (int i = 0; i <12; i++) {
	    		percentEachMonth.add(Integer.valueOf(
	    		Driver.getDriver().findElement(
	    	By.xpath("(//div[@class='data fatality-table']/table)[11]/tbody/tr["+(i+1)+"]/td[2]")).getText()));
	    	 }
	    	System.out.println(percentEachMonth);
	    	
	         for(Integer m: percentEachMonth)
	           sum = sum+m;
	         return sum;
      }

}
