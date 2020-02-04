package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseTest {
	ChromeDriver dr; 
	//int a;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\wahid\\\\Downloads\\\\chromedriver.exe");
		dr = new ChromeDriver();
		//a =10;
	
	}
	public void getWebSite(String url) {
		
		dr.get(url);
	}
	
	//the type of data u need, same type of argument you have to set	
	public void verifyElemnetDisplayed(By by) {
	
	boolean a = dr.findElement(by).isDisplayed();
	System.out.println("Element is Displayed or no : " +a);
	}
	public void type(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	public void clickElement(By by) {
		dr.findElement(by).click();
	
	}
	public void selectByVisibleText(By by, String value) {
		new Select(dr.findElement(by)).selectByVisibleText(value);
	}
	public void verifyPageTitle(String expectedTitle) {
		String actualTitle=dr.getTitle();
		boolean g = actualTitle.equals(expectedTitle);
		System.out.println("URL matched: "+g);
	}
	public void verifyPageURL(String expectedURL) {
		String actualURL = dr.getCurrentUrl();
		boolean y = actualURL.contains(expectedURL);
		System.out.println("URL matched: "+y);
	}	
	public void myWaits(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	
}
