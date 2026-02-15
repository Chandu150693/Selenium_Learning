/*
 * ID
 * name
 * XPath
 * CSS Selector
 * Class Name
 * Tag Name
 * Link Text
 * Partial Link Text
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
	public static void main(String[] args) {

		// https://www.facebook.com/

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testuser");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		// ID
		// driver.findElement(By.id("elementId"));

		// Name
		// driver.findElement(By.name("elementName"));

		// XPath
		// driver.findElement(By.xpath("//tag[@attribute='value']"));

		// CSS Selector
		// driver.findElement(By.cssSelector("tag[attribute='value']"));

		// Class Name
		// driver.findElement(By.className("className"));

		// Tag Name
		// driver.findElement(By.tagName("tagName"));

		// Link Text
		// driver.findElement(By.linkText("Link Text"));

		// Partial Link Text
		// driver.findElement(By.partialLinkText("Partial Link"));

	}
}
