package se.iths;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TimeConverterTest {

	TimeConverter timeconv;
	
	@BeforeClass
	public static void before(){
		System.out.println("Nu testar vi Time Converter");
	}
	
	@Before
	public void start (){
		timeconv = new TimeConverter();
	}
	
	@AfterClass
	public static void after(){
		System.out.println("Time Converter är klar");
		}
	
	@Test
	public void testgetMeridiemPM() {
		String sum = timeconv.getMeridiem(23);
		assertEquals("PM", sum);
		System.out.println(sum + " PM");
		}
	
	@Test
	public void testgetMeridiemAM() {
		String sum = timeconv.getMeridiem(11);
		assertEquals("AM", sum);
		System.out.println(sum  + " AM");
		}
	
	//@Test(expected = IllegalArgumentException.class)
	@Test
	public void testgetMeridiemttoLarge() {
		String sum = timeconv.getMeridiem(25);
		assertEquals("PM", sum);
		System.out.println(sum  + "toLarge");
		}
	
	//@Test(expected = IllegalArgumentException.class)
	@Test
	public void testgetMeridiemttoSmall() {
		String sum = timeconv.getMeridiem(-1);
		assertEquals("AM", sum);
		System.out.println(sum + "toSmall");
		}
}
