import org.openqa.selenium.edge.EdgeDriver;

public class SelfInreoduction {
	public static void main(String[] args) {
		// Invoking Browser
		// Safari - SafariDriver
		// WebDriver - Interface

		// Chrome Driver -> chromedriver.exe
//		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();

		
		// FireFox Driver -> geckodriver.exe
		//FirefoxDriver driver = new FirefoxDriver();
		
		// Edge Driver -> msedgedriver.exe
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title of the page is: "+ driver.getTitle());
		System.out.println("Current URl is: "+ driver.getCurrentUrl());
		driver.close();
		
		// next video : 15
	}
}
