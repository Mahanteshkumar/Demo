package javaBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQaCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.linkText("Elements")).click();
		driver.findElement(By.linkText("Check Box")).click();
		driver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		//actions.moveToElement(driver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"))).click().perform();
		
		List<WebElement> exp = driver.findElements(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
		for(WebElement ele:exp) {
			ele.click();
		}
		List<WebElement> inexp = driver.findElements(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
		for(WebElement ele:inexp) {
			ele.click();
		}
		List<WebElement> checkboxs = driver.findElements(By.xpath("//span[@role='checkbox']"));
		for(WebElement ele: checkboxs) {
			if(ele.isSelected()) {
			ele.click();
			}
		}
		List<WebElement> numOfceck = driver.findElements(By.xpath("//div[@role='treeitem']"));
		for(WebElement ele:numOfceck) {
			System.out.println(ele.getText());
		}
	}

}
