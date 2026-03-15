import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("http://spicejet.com");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(1);

		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("Option2");

		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("option3");

		System.out.println(dropdown.getFirstSelectedOption().getText());

		System.out.println(dropdown.getOptions().size());

		driver.navigate().to("https://spicejet.com");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div[1]/div[2]/input")).sendKeys("VTZ");
		
//		driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).click();
		
		System.out.println("Before Click : "+driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText());
		
		for(int i=1; i<8; i++) {
			driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
		}
		
		System.out.println("After Click : "+driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText());
		
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
		
		
		driver.close();

	}
}
