package se.iths;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;

import org.junit.experimental.categories.Category;

public class Testlab1 {
	Lab1 lab1;
		
	@BeforeClass
	public static void before(){
		System.out.println("Välkommen! Nu kör vi igång.");
	}
	
	@Before
	public void start (){
		lab1 = new Lab1();
	}
	
	@AfterClass
	public static void after(){
		System.out.println("Tack för idag!");
		}

	@Test
	@Category(Matte.class)
	public void testAdd() {
		int sum = lab1.add(2,4);
		assertEquals(6, sum);
		}
	
	@Test
	@Category(Matte.class)
	public void testDivide() {
		int sum = lab1.divide(4,2);
		assertEquals(2, sum);
		}
	@Test(expected = ArithmeticException.class)
	@Category(Matte.class)
	public void testDivide0() {
		 lab1.divide(4,1);
		}
	    
	@Test
	@Category(Matte.class)
	public void testMultiply() {
		int sum = lab1.multiply(2,4);
		assertEquals(8, sum);
		}
	
	@Test
	public void testQuote() {
		String sum = lab1.quote();
		assertTrue(sum == "We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein"  
				||sum == "A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare"
				||sum == "You must be the change you wish to see in the world. - Mahatma Gandhi"
				||sum == "In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr."
				||sum == "Choose a job you love, and you will never have to work a day in your life. - Confucius"
				||sum == "To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde"
				||sum == "Without music, life would be a mistake. - Friedrich Nietzsche"
				||sum == "I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams"
				);
	}
		
	@Test
	public void testReverse() {
		String sum = lab1.reverse("ojoj");
		assertEquals("jojo", sum);
		}

	@Test
	@Category(Matte.class)
	public void testSubtract() {
		int sum = lab1.subtract(4,6);
		assertEquals(-2, sum);
		}

	@Test
	public void testGetCounter() {
		int startCounter = lab1.getCounter();
		lab1.subtract(4,2);
		lab1.divide(4,2);
		lab1.add(4,2);
		lab1.multiply(4,2);
		lab1.reverse("ojoj");
		lab1.quote();
		
		int sum= lab1.getCounter() - startCounter;
		
		assertEquals(6, sum);
		// antal testade moduler(förutom countern)
		System.out.println("Räknaren ser att du har testat " + sum + " moduler.");
	}
}
