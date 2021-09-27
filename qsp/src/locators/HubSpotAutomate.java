package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubSpotAutomate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://app.hubspot.com/login");
		driver.findElement(By.id("username")).sendKeys("dhiraj");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("desale");
		driver.findElement(By .id("password-login-button")).click();

	}

}
