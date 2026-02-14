import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfInreoduction {
	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver
		// Firefox - GeckoDriver
		// Edge - EdgeDriver
		// Safari - SafariDriver
		// WebDriver - Interface

//		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();

		
		// FireFox Driver
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title of the page is: "+ driver.getTitle());
		System.out.println("Current URl is: "+ driver.getCurrentUrl());
		driver.close();
		
		// next video : 15
	}
}
