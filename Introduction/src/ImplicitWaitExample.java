import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class ImplicitWaitExample {
	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Edge driver
		WebDriver driver = new EdgeDriver();

		// Set an implicit wait time of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
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
		
		Thread.sleep(2000); // Explicit wait actually, need to add but thread sleep is used.
		// ID
		driver.findElement(By.id("inputUsername")).sendKeys("Chandu");	
		// Name
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		// Close the browser
		
		Thread.sleep(3000);
		
		String helloTxt = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		String welcomeTxt = driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText();
		String sucessTxt = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
		
		System.out.println(helloTxt);
		System.out.println(welcomeTxt);
		
		Assert.assertEquals(sucessTxt, "You are successfully logged in.");
		
		driver.findElement(By.cssSelector(".logout-btn")).click();
				
		driver.close();
		System.out.println(sucessTxt+" \nTest case passed successfully.");
		
	}
}
