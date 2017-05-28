package se.iths.mvn_selenium2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestReview {
	public static void reviewTest(WebDriver driver) throws InterruptedException{
		WebDriverWait w = new WebDriverWait(driver, 30);
		Login.startLogin(driver);
	      Thread.sleep(1000);//!
	      driver.findElement(By.xpath("//div[@id='pageContainer']/div[2]/div[3]/div[2]/div/div[2]/div/div/a/img")).click();
	      driver.findElement(By.linkText("Customer review(s)")).click();
	      w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("reviewButton")));
	      driver.findElement(By.id("reviewButton")).click();
	      driver.findElement(By.id("description")).clear();
	      driver.findElement(By.id("description")).sendKeys("Bra bok");
	      driver.findElement(By.cssSelector("#review > button.btn")).click(); 
	      WebElement reviewBook = driver.findElement(By.xpath(" .//*[@id='h2tab3']/p"));
	  	  assertEquals("Bra bok", reviewBook.getText());
	      System.out.println("Test 10, review");
	      driver.quit();
	 }
}
