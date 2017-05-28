package se.iths.mvn_selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import se.iths.mvn_selenium2.pages.ParentPage;

	public class Login extends ParentPage{
	
	public static void startLogin(WebDriver driver){
		  driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
	      driver.findElement(By.cssSelector("#customerAccount > button.btn.dropdown-toggle")).click();
	      driver.findElement(By.id("signin_userName")).clear();
	      driver.findElement(By.id("signin_userName")).sendKeys("annapanna");
	      driver.findElement(By.id("signin_password")).clear();
	      driver.findElement(By.id("signin_password")).sendKeys("elsapi");
	      driver.findElement(By.id("login-button")).click();
	}

}
