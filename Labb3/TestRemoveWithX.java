package se.iths.mvn_selenium2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestRemoveWithX {
	public static void removeWithXTest(WebDriver driver)throws InterruptedException{
		Thread.sleep(1000);//!
		driver.findElement(By.xpath(".//*[@id='open-cart']")).click();
		driver.findElement(By.xpath(".//*[@id='1']/td[4]/button")).click();
		WebElement varuKorg = driver.findElement(By.id("open-cart"));
		Thread.sleep(1000);//!
    	System.out.println("Test 8: " + varuKorg.getText());
    	assertEquals("SHOPPING CART (1)",  varuKorg.getText());
    	driver.quit();
	}
}
