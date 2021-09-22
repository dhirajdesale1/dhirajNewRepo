package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphismLaunchBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name that u want to open either chrome or firefox");
		String browserValue=sc.nextLine();//takes input from the user
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();//open chrome browser
			driver.manage().window().maximize();//maximize the browser
			Thread.sleep(3000);//provide delay
			driver.get("https://www.google.com");//launch chrome browser
			driver.close();//close the chrome browser
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();//open firefox browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch chrome browser
			driver.close();//close the chrome browser
		}
		else
		{
		System.out.println("enter the valid input");	
		}
		
		
	}

}
