package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement box1 = driver.findElement(By.xpath( "//div[@id='column-a']"));
		WebElement box2 = driver.findElement(By.xpath( "//div[@id='column-b']"));
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(box1, 150, 150).build().perform();
		act.dragAndDrop(box1, box2).build().perform();
		
		
		
	}

}
