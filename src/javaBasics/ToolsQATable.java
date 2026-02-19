package javaBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQATable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demoqa.com/");
		driver.findElement(By.linkText("Elements")).click();
		driver.findElement(By.linkText("Web Tables")).click();
		List<WebElement> header = driver.findElements(By.tagName("th"));
		for(WebElement ele:header) {
			System.out.println(ele.getText());
		}
		driver.findElement(By.id("addNewRecordButton")).click();
		//driver.switchTo().alert();
		driver.findElement(By.id("firstName")).sendKeys("purvi");
		driver.findElement(By.id("lastName")).sendKeys("kumar H");
		driver.findElement(By.id("userEmail")).sendKeys("purvik@gmail.com");
		driver.findElement(By.id("age")).sendKeys("2");
		driver.findElement(By.id("salary")).sendKeys("100000");
		driver.findElement(By.id("department")).sendKeys("Business");
		driver.findElement(By.id("submit")).click();
		//driver.switchTo().defaultContent();
		List<WebElement> data = driver.findElements(By.tagName("td"));
		String nm="Alden";
		for(WebElement ele:data) {
			String text=ele.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("purvi"))
				System.out.println("data added to table");
			if(text.equalsIgnoreCase(nm)) {
				driver.findElement(By.xpath("//td[text()='"+nm+"\']/../td//span[@title='Delete']")).click();
			}
		}
		
	}

}
