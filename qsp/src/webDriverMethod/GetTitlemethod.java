package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//open the browser
		Thread.sleep(3000);//delay provide
		driver.get("https://www.selenium.dev/downloads/");//open selenium.dev
		System.out.println(driver.getTitle());//get title
		Thread.sleep(3000);//provide delay
		driver.close();//close the browser

	}

}
