package se.iths.mvn_selenium2;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import se.iths.mvn_selenium2.pages.ParentPage;

public class TestChangeCheckOut  extends ParentPage {
	public static void changeCheckOutTest(WebDriver driver)throws InterruptedException{
		WebDriverWait w = new WebDriverWait(driver, 50);
		Thread.sleep(1000);//!
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("open-cart")));
		Thread.sleep(1000);//!
		driver.findElement(By.id("open-cart")).click();
		Thread.sleep(1000);//!
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Checkout")));
		driver.findElement(By.linkText("Checkout")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("quantity")));
		driver.findElement(By.name("quantity")).clear();
	    driver.findElement(By.name("quantity")).sendKeys("300");
	    driver.findElement(By.linkText("Recalculate")).click();
	    Thread.sleep(1000);//!
	   // w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("open-cart")));
	    WebElement varuKorg = driver.findElement(By.id("open-cart"));
	    Thread.sleep(1000);//!
	    assertEquals("SHOPPING CART (300)",  varuKorg.getText());
	    System.out.println("Test 4 öka antal: " + varuKorg.getText());
	    driver.quit();
}

}
