import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfInreoduction {
	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver
		// Firefox - GeckoDriver
		// Edge - EdgeDriver
		// Safari - SafariDriver
		// WebDriver - Interface
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title of the page is: "+ driver.getTitle());
		driver.close();
	}
}
