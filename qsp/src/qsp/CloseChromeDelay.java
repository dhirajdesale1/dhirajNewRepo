package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeDelay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();// to open a browser
		Thread.sleep(10000);// using that we can give a delay
		c1.close();// we close the browser

	}

}
