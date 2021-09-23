package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/sai/Desktop/html%20automation/anchor.html");
			Thread.sleep(1000);
			String pagesource = driver.getPageSource();
			System.out.println(pagesource);
			driver.close();
	}

}
