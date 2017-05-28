package se.iths.mvn_selenium2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestAddToCart {
	public static void addToCartTest(WebDriver driver)throws InterruptedException{
		Thread.sleep(1000);//!
		WebElement varuKorg = driver.findElement(By.id("open-cart"));
	    assertEquals("SHOPPING CART (1)",  varuKorg.getText());
	    System.out.println("Test 3 lägg i varukorgen: " + varuKorg.getText());
	    driver.quit();
		}
	}
	
