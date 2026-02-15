import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExampleOne {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// ID
		driver.findElement(By.id("inputUsername")).sendKeys("Chandu");	
		// Name
		driver.findElement(By.name("inputPassword")).sendKeys("Chandu@123");
		// Class Name
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.className("error")).getText());
		
		
	}
}
