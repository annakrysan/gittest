package se.iths.mvn_selenium2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shoptest {
	
	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program\\Gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	// 1 Här förväntar jag mig att komma till startsidan när "home"
	// väljs(symbolen med ett hus)
	public void test1GoToHome() throws InterruptedException {
		GotoHome.homeByHouse(driver);
	}

	@Test
	// 2 Test inloggningsfunktion
	public void test2LoggaIn() throws InterruptedException {
		Login.startLogin(driver);
		Thread.sleep(1000);// !
		TestLogin.loginTest(driver);
	}

	@Test
	// 3 Lägg i varukorg, kontrollera att antal ökat
	public void test3AddToCart() throws InterruptedException {
		VaraTillKorgen.enVara(driver);
		TestAddToCart.addToCartTest(driver);
	}

	@Test
	// Test 4 lägg vara i korgen, gå till kassan och ändra antal,
	// kontrollera att antal i varukorgen i övre högra hörnet är det nya antalet
	public void test4Change() throws InterruptedException {
		VaraTillKorgen.enVara(driver);
		TestChangeCheckOut.changeCheckOutTest(driver);
	}

	@Test
	// 5 Test knapp remove i kassan
	public void test5Remove() throws InterruptedException {
		VaraTillKorgen.enVara(driver);
		TestRemoveChekOut.removeCheckOutTest(driver);
	}

	@Test
	// 6 Recalculate, kontrollera att summan stämmer
	public void test6CheckSum() throws InterruptedException {
		VaraTillKorgen.enVara(driver);
		TestCheckSum.checkSumTest(driver);
	}

	@Test
	// 7 Test logga ut
	public void test7Logout() throws InterruptedException {
		Login.startLogin(driver);
		TestLogOut.logOutTest(driver);
	}

	@Test
	// Test 8 ta bort vara ur varukorg med hjälp av krysset
	public void test8RemoveWithX() throws InterruptedException {
		VaraTillKorgen.tvaVaror(driver);
		TestRemoveWithX.removeWithXTest(driver);
	}

	// 9 Testa sort genom att välja 1. computer books, 2.sort by price, 3.
	// kontrollera att "Programming for paas är först".

	@Test
	public void test9Sort() throws InterruptedException {
		TestSort.sortTest(driver);
	}

	// 10 skriv review
	@Test
	public void test10Review() throws InterruptedException {
		TestReview.reviewTest(driver);
	}
}
