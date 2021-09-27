package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalBazeAutomate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://login.globalglaze.in/");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_usernm")).sendKeys("dhiraj");
		Thread.sleep(3000);
		driver.findElement(By.id("adminpassword")).sendKeys("desale");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_go")).click();

	}

}
