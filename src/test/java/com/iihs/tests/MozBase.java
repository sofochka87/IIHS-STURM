package com.iihs.tests;

import java.util.List;

import com.iihs.pages.Fatality_Facts;
import com.iihs.pages.SPA_973_page;
import com.iihs.pages.SPA_974_page;
import com.iihs.pages.SPA_975_page;
//import com.iihs.pages.SPA_976_MOzPages;

public class MozBase extends TestBase {
	
	protected Fatality_Facts facts = new Fatality_Facts();
	protected SPA_973_page webElems973 = new SPA_973_page();
	protected SPA_974_page webElems974 = new SPA_974_page();
	protected SPA_975_page webElems975 = new SPA_975_page();
	//protected SPA_976_MOzPages webElems976 = new SPA_976_MOzPages();
	protected String expected;
	protected String actual;
	protected List<String> expectedList;
	protected List<String> actualList;
	
}
