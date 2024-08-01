package com.letcode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class FindElements_Test {

	public static WebDriver driver ;
	
	/*
	 * public static void main(String[] args) throws Exception {
	 * 
	 * driver = Base_Class.browser_Launch("chrome");
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * Base_Class.getURL("https://www.google.in/");
	 * 
	 * driver.findElement(By.xpath("//textarea[@title = 'Search']")).sendKeys(
	 * "cricket", Keys.ENTER); List<WebElement> cricket = driver.findElements(By.
	 * xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket') ]"));
	 * System.out.println(cricket.size());
	 * 
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) throws Exception {


		driver = Base_Class.browser_Launch("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Base_Class.getURL("https://letcode.in/edit");
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		WebElement last = labels.get(labels.size()-1);
		System.out.println(last.getText());
		int size = labels.size();
		if (size == 6) {
			System.out.println("Passed");
			for (WebElement lb : labels) {
				System.out.println(lb.getText());
			}
		}
		
		Base_Class.driverQuit();



	}

}