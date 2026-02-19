package javaBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FrstJavaTestScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// adding implicit wait of 15 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Opening the webpage where we will identify edit box to enter
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");

		// getting current URL
		System.out.println("Getting the Current URL: " + driver.getCurrentUrl());

		// Identify the input box with xpath locator
		WebElement e = driver.findElement(By.xpath("//*[@id='fullname']"));
		Thread.sleep(1000);
		// enter text in input box
		e.sendKeys("First Test Script");

		// Get the value entered
		String text = e.getAttribute("value");
		System.out.println("Entered text is: " + text);
		Thread.sleep(1000);
		// clear the text entered
		e.clear();

		// Get no text after clearing text
		String text1 = e.getAttribute("value");
		System.out.println("Get text after clearing: " + text1);

		// Closing browser
		driver.quit();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // Modern headless mode (Chrome 109+)
		options.addArguments("--disable-gpu", "--no-sandbox"); // Optional for stability
		WebDriver driver1 = new ChromeDriver(options);
		driver1.get("https://www.google.com");
		System.out.println("Title: " + driver1.getTitle());
		driver1.quit();
		
	}

}
