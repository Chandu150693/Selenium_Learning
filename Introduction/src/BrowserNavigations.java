import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		System.out.println("Title : " + driver.getTitle());

		driver.navigate().to("http://www.google.com/");

		System.out.println("Title : " + driver.getTitle());

		driver.navigate().back();

		System.out.println("Title : " + driver.getTitle());

		driver.navigate().forward();

		System.out.println("Title : " + driver.getTitle());

		driver.navigate().back();

		System.out.println("Title : " + driver.getTitle());

		// Refresh page:
		driver.navigate().refresh();

		driver.close();
	}
}
