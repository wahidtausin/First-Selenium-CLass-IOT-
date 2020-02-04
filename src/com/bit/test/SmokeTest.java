package com.bit.test;
import org.openqa.selenium.By;

public class SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		//**common c = new common();
		
		//c.openBrowser();
		//c.getWebsite("https://www.facebook.com");
		//c.myType(By.id(""), "something");
		//c.myClick(by, value);
		
		BaseTest b = new BaseTest();
		b.openBrowser();
		b.getWebSite("https://www.target.com/");
		b.myWaits(5000);
		b.verifyPageTitle("Target : Expect more. pay less");
		b.verifyPageURL("https://www.target.com/");
		b.myWaits(3000);
		b.verifyElemnetDisplayed(By.xpath("jhgchgfhgfhgfgfut"));
		b.type(b.dr.findElement(By.id("eferf")), "kids scooter");
		b.clickElement(By.cssSelector("lskfhasfsl"));
	}
	
}
