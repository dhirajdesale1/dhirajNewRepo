package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//open the browser
		
		driver.get("https://www.google.com");//launch google
		Thread.sleep(3000);//provide delay
		driver.quit();//close the browser
}

}
