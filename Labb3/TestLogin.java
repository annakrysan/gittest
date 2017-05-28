package se.iths.mvn_selenium2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import se.iths.mvn_selenium2.pages.ParentPage;

public class TestLogin extends ParentPage{
	public static void loginTest(WebDriver driver)throws InterruptedException{ 
		WebDriverWait w = new WebDriverWait(driver, 30);
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='customerAccount']/button")));
	    Thread.sleep(1000);//! 
	    WebElement statusLogin= driver.findElement(By.xpath(".//*[@id='customerAccount']/button"));
	    Thread.sleep(1000);//! 
	    assertEquals("WELCOME 'ANNA'",  statusLogin.getText());
	    System.out.println("Test 2, inloggning: " + statusLogin.getText());
	    driver.quit();
	}

}
