package javaBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerse {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		/*
		 * String[] vegNames = { "Cucumber", "Brocolli", "Potato" };
		 * driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 * List<WebElement> products =
		 * driver.findElements(By.cssSelector("h4.product-name")); for (int i = 0; i <
		 * products.size(); i++) { String[] name = products.get(i).getText().split("-");
		 * List al = Arrays.asList(vegNames); if (al.contains(name[0].trim())) {
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
		 * ); } } driver.close();
		 */
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/cookies/");
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept
		// All']"))).click();
		
		WebElement about = driver.findElement(By.id("navbarDropdown"));
		about.click();
		 Select dropdown = new Select(about);
		Actions action = new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
	}
}
