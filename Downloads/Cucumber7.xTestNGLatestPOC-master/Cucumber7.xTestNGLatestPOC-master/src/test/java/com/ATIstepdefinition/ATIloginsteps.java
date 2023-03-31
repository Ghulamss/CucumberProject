package com.ATIstepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ATIloginsteps {
	public static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	   
	}

	@When("user entering username and passord")
	public void user_entering_username_and_passord() {
		driver.findElement(By.id("input-email")).sendKeys("abcd");
		driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user should be on homepage")
	public void user_should_be_on_homepage() {
		//driver.close();
	   
	}


}
