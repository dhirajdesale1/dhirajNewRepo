package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//open the chrome browser
		Thread.sleep(3000);//provide delay
		driver.get("https://www.google.com");//launch google
		Thread.sleep(3000);//provide delay
		driver.close();//close the browser
	}

}
