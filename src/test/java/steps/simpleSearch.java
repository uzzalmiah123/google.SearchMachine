package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class simpleSearch extends testBase{

	
	@Given("i am on the google home page")
	public void i_am_on_the_google_home_page() {
		
	launchBrowser();
	}

	@When("i enter the {string}")
	public void i_enter_the(String product_name) {
		
		//WebElement searchBar = driver.findElement(By.className("gLFyf"));
		//searchBar.sendKeys(product_name);
		googleHomePage gp = new googleHomePage(driver);
		gp.enteringProductName(product_name);
	}

	@When("i clink on the search button")
	public void i_clink_on_the_search_button() {
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.click();
		
		googleHomePage gp = new googleHomePage(driver);
		gp.clickingOnSearchButton();
		
	   
	}

	@Then("i see the realted search reesults successfully")
	public void i_see_the_realted_search_reesults_successfully() {
		
		/*WebElement searchResult = driver.findElement(By.id("result-stats"));
		
		System.out.println("===========================================");
		
		String resultText = searchResult.getText();
		
		System.out.println(resultText);
		
		System.out.println("========================");
		
	boolean displayResults = searchResult.isDisplayed();*/
		googleHomePage gp = new googleHomePage(driver);
	
	Assert.assertTrue(gp.isSearchRerchResultVisible(), "Search Result is not desplay");
	closeCurrent();
	closeAll();
	
	    
	}


}
