package se.iths;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestLabb2 {

	MeasureConverter mConv;
	TimeConverter tConv;
	Americanizer americanizer;
	
	@BeforeClass
	public static void before(){
		System.out.println("Välkommen till Labb2");
	}
	
	@Before
	public void start (){
		mConv = new MeasureConverter();
		tConv = new TimeConverter();
		americanizer = new Americanizer();
	}
	
	@AfterClass
	public static void after(){
		System.out.println("TestLabb2 avslutas nu");
		}

	
	@Test
	public void testAmericanizer() {
	 
		String sentence = "solen är här";
		String sum = americanizer.convertSpeach(sentence);
		assertEquals("yo dude!" + sentence + ", you know?", sum);
		System.out.println(sum);
		}
	
	// skapa flera tester mot time converter som inte går bra
	@Test
	public void testConvertTime() {
		americanizer.setTimeConverter(tConv);
		String sum = americanizer.convertTime(23);
		assertEquals(11 +" PM", sum);
		System.out.println("Labb2 1 " + sum);
		}
		
	// Test av värden utanför dygnsintervallet
	@Test
	public void testConvertTimeStor() {
		americanizer.setTimeConverter(tConv);
		String sum = americanizer.convertTime(25);
		//25-12 = 13
		assertEquals(13 +" PM", sum);
		System.out.println("Labb2 1 " + sum);
		}
	
	@Test
	public void testConvertTimeNeg() {
		americanizer.setTimeConverter(tConv);
		String sum = americanizer.convertTime(-13);
		assertEquals(-1 +" PM", sum);
		System.out.println("Labb2 1 " + sum);
		}
	
	// testa skicka in negativa pounds
	@Test
	public void testconvertWeight() {
		americanizer.setWeightConverter(mConv);
		int sum = americanizer.convertToPound(54);
		assertEquals(20, sum);
		System.out.println("Labb2 2:" + sum);
		}
	
	@Test
	public void testconvertWeightNeg() {
		americanizer.setWeightConverter(mConv);
		int sum = americanizer.convertToPound(-54);
		assertEquals(-20, sum);
		System.out.println("Labb2 2:" + sum);
		}

		
	@Test
	public void testconvertWeightFeet() {
		americanizer.setWeightConverter(mConv); 
		int sum = americanizer.convertToFeet(270);
		assertEquals(9, sum);
		System.out.println("Labb2 3:" + sum);
		}
	
}
