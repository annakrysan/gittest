package se.iths.mvn_selenium2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSort {
	public static void sortTest(WebDriver driver)throws InterruptedException{
		WebDriverWait w = new WebDriverWait(driver, 50);
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		driver.findElement(By.cssSelector("span.name")).click();
		driver.findElement(By.linkText("Computer Books")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("filter")));
		new Select(driver.findElement(By.id("filter"))).selectByVisibleText("Price");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 300);");
		Thread.sleep(2000);
		WebElement sortBook = driver.findElement(By.xpath(" .//*[@id='productsContainer']/div[1]/div/div[2]/div/div/h3"));
		System.out.println("Test 9, sort: " + sortBook.getText());
		assertEquals("Programming for PAAS",  sortBook.getText());
		driver.quit();
		}
	}
