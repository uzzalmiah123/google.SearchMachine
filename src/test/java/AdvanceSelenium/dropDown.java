package AdvanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.xpath( "//select[@id='dropdown']"));
		Select S = new Select(dropdown);
		
		S.selectByIndex(2);
		S.selectByValue("1");
		S.selectByVisibleText("Option 2");
		
		List<WebElement>dropDownList = S.getOptions();
		//System.out.println(dropDownList);
		
		for(int i = 0; 1< dropDownList.size(); i++) {
			String optionText = dropDownList.get(i).getText();
			
			System.out.println(optionText);
		}
		
}

}
