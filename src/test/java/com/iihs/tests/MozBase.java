package com.iihs.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_973_MOzPages;
import com.iihs.pages.SPA_974_MOzPages;
import com.iihs.pages.SPA_975_MOzPages;

public class MozBase extends TestBase {
	
	//protected Fatality_Facts facts = new Fatality_Facts();
	
	protected SPA_973_MOzPages webElems973 = new SPA_973_MOzPages();
	protected SPA_974_MOzPages webElems974 = new SPA_974_MOzPages();
	protected SPA_975_MOzPages webElems975 = new SPA_975_MOzPages();
	protected SPA_976_MOzPages webElems976 = new SPA_976_MOzPages();
	protected String expected;
	protected String actual;
	protected List<String> expectedList;
	protected List<String> actualList;
	
}
