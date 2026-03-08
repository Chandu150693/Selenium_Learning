import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExampleTwo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println("Link : "+driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
		
		driver.close();
	}
}
