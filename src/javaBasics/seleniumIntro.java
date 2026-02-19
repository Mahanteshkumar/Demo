package javaBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class seleniumIntro {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\purvi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.get("https://rahulshettyacademy.com/");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl()); driver.close();
		 *///closes current window
		//driver.quit(); - closes all associated windows opened by selenium
		/*
		 * WebDriverManager.firefoxdriver().setup(); 
		 * WebDriver driver1 = new FirefoxDriver(); 
		 * driver1.get("https://rahulshettyacademy.com/");
		 */
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver1 = new EdgeDriver();
		 * driver1.manage().window().maximize(); driver1.manage().deleteAllCookies();
		 * driver1.get("https://rahulshettyacademy.com/");
		 */
	}

}
