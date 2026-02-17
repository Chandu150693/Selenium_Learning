import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWaitExample {
	public static void main(String[] args) {
		
		// Create a new instance of the Edge driver
		WebDriver driver = new EdgeDriver();

		// Set an implicit wait time of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// ID
		driver.findElement(By.id("inputUsername")).sendKeys("Chandu");	
		// Name
		driver.findElement(By.name("inputPassword")).sendKeys("Chandu@123");
		// Class Name
		driver.findElement(By.className("signInBtn")).click();
		// cssSelector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// Find the "Forgot your password?" link and click it
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Chandu");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("chandu@test.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("chandu@rt.com");
		
		//index of the element
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9876543210");

		
		//index with cssSelector
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9876543210");
		
		
		//click on reset password button
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		
		String infoMsg = driver.findElement(By.className("infoMsg")).getText();
		String password = infoMsg.split("'")[1];
		System.out.println("Password is: " + password);
		
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		
		// ID
		driver.findElement(By.id("inputUsername")).sendKeys("Chandu");	
		// Name
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("signInBtn")).click();
		// Close the browser
//		driver.close();
	}
}
