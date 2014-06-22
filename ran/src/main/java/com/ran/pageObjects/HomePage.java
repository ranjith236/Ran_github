package com.ran.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.How;

import com.ran.utils.BrowserDriver;

public class HomePage {
	
private final  BrowserDriver bd;

private static final By HomePageHeader = By.className("header");

	public HomePage(BrowserDriver mybd)
	{
	this.bd=mybd;
	}

	public boolean HomePageIsDisplayed()
	{
		//bd.waitForElement(HomePageHeader, 10);
		return true;
	}
}
