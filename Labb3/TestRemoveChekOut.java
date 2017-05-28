package se.iths.mvn_selenium2;

import org.openqa.selenium.WebDriver;

import se.iths.mvn_selenium2.pages.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.assertEquals;

public class TestRemoveChekOut extends ParentPage{
	public static void removeCheckOutTest(WebDriver driver) throws InterruptedException{
		Thread.sleep(1000);//!
		WebDriverWait w = new WebDriverWait(driver, 40);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("open-cart")));
		driver.findElement(By.id("open-cart")).click();
		driver.findElement(By.linkText("Checkout")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".btn-danger")));
		driver.findElement(By.cssSelector(".btn-danger")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("open-cart")));
		WebElement varuKorg = driver.findElement(By.id("open-cart"));
		assertEquals("SHOPPING CART (0)",  varuKorg.getText());
		System.out.println("Test 5 remove: " + varuKorg.getText());
		driver.quit();
		
	}

}
