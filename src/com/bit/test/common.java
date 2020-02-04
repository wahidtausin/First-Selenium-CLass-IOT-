
package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
public class common {
	
  ChromeDriver dr;
	int a;
	void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wahid\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		a=10;
	}
	void getWebsite(String url) {
		dr.get(url);
	}
	void myClick(By by, String value) {
		dr.findElement(by).sendKeys(value);
	}
	void myType(By by, String value) {
		dr.findElement(by).sendKeys(value);
	}
}
/*
Right click on the project
Properties
JavaBuild Path
libraries
add External Jar
select the file u want t add



*/