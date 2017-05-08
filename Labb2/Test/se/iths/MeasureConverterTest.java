package se.iths;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MeasureConverterTest {

	MeasureConverter measureconv;
	
	@BeforeClass
	public static void before(){
		System.out.println("Nu testar vi MeasureConverter");
	}
	
	@Before
	public void start (){
		measureconv = new MeasureConverter();
	}
	
	@AfterClass
	public static void after(){
		System.out.println("MeasureConverter är klar");
		}

	@Test
	public void testconvertWeightKg() {
		int sum = measureconv.convertWeight(27,true);
		assertEquals(10, sum);
		System.out.println(sum + " kg");
		}
	@Test
	public void testconvertWeightKgNeg() {
		int sum = measureconv.convertWeight(-27,true);
		assertEquals(-10, sum);
		System.out.println(sum + " kg");
		}
	
	@Test
	public void testconvertWeightPounds() {
		int sum = measureconv.convertWeight(10,false);
		assertEquals(27, sum);
		System.out.println(sum + " pounds");
		}
	public void testconvertWeightPoundsNeg() {
		int sum = measureconv.convertWeight(-10,false);
		assertEquals(-27, sum);
		System.out.println(sum + " pounds");
		}
	
	@Test
	public void testconvertToFeet() {
		int sum = measureconv.convertToFeet(90);
		assertEquals(3, sum);
		System.out.println(sum + " feet");
		}
	@Test
	public void testconvertToFeetNeg() {
		int sum = measureconv.convertToFeet(-90);
		assertEquals(-3, sum);
		System.out.println(sum + " feet");
		}
}
