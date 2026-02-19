package javaBasics;
import java.time.Duration;

import org.apache.hc.core5.util.Asserts;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQAAllEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demoqa.com/");
		driver.findElement(By.linkText("Elements")).click();
		WebElement textbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Text Box")));
		textbox.click();
		driver.findElement(By.id("userName")).sendKeys("purvik");
		driver.findElement(By.id("userEmail")).sendKeys("purvi@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Vijayanagara, Bangalore-560040");
		driver.findElement(By.id("permanentAddress")).sendKeys("Vijayanagara, Bangalore-560040");
		WebElement submit = driver.findElement(By.id("submit"));
		//Actions actions = new Actions(driver);
		//actions.moveToElement(submit).click().perform();
		try {
			submit.click();
		}catch(ElementClickInterceptedException e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", submit);
		submit.click();
		}
		WebElement username = driver.findElement(By.id("name"));
		wait.until(ExpectedConditions.visibilityOf(username));
		Assert.assertTrue(false, username.getText().concat("purvik"));
	}

}
