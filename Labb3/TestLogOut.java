package se.iths.mvn_selenium2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestLogOut {
	public static void logOutTest(WebDriver driver)throws InterruptedException{
		Thread.sleep(1000);//!
		driver.findElement(By.cssSelector("#customerAccount > button.btn.dropdown-toggle")).click();
		Thread.sleep(1000);//!
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);//!
		WebElement statusLogin= driver.findElement(By.id("customerAccount"));
		assertEquals("SIGNIN",  statusLogin.getText());
		System.out.println("Test 7, logga ut: " + statusLogin.getText());
		driver.quit();
		}
	}