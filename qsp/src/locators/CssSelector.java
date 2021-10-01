package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("automation");
		//driver.findElement(By.cssSelector("input[title ^='Se']")).sendKeys("automation");
		//driver.findElement(By.cssSelector("input[title $='ch']")).sendKeys("automation");
		driver.findElement(By.cssSelector("input[title *='ear']")).sendKeys("automation");
		
	}
}
