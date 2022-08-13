package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.inetbanking.utilities.ReadConfig;

public class RunBat {
	
	
	public static void main(String[] args) throws InterruptedException {
		ReadConfig readconfig = new ReadConfig();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharanya Rajasekaran\\Sharanya-eclipse-workspace\\inetbankingV1-master\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/index.php");
		Thread.sleep(2000);
		driver.close();
		
	}

}
