package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeDelay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		Thread.sleep(10000);
		c1.close();
		


	}

}
