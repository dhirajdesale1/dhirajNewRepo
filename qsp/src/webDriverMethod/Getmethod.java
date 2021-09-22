package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();//open the chrome browser
		Thread.sleep(3000);//provide delay
		driver.get("https://www.google.com");//launch google browser
	
		
	}

}
