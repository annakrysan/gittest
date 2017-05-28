package se.iths.mvn_selenium2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCheckSum {
	public static void checkSumTest(WebDriver driver)throws InterruptedException{
		WebDriverWait w = new WebDriverWait(driver, 50);
		Thread.sleep(1000);//!
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("open-cart")));
		driver.findElement(By.id("open-cart")).click();
		driver.findElement(By.linkText("Checkout")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("quantity")));
		driver.findElement(By.name("quantity")).clear();
  	    driver.findElement(By.name("quantity")).sendKeys("10");
  	    driver.findElement(By.linkText("Recalculate")).click();
  	    Thread.sleep(1000);//!
  	    WebElement total = driver.findElement(By.xpath(".//*[@id='mainCartTable']/tbody/tr[2]/td[3]/strong"));
   	  	System.out.println("Test 6, totalsumma: " + total.getText());
  	  	assertEquals("CAD399.90",  total.getText());
  	  	driver.quit();
	}

}
