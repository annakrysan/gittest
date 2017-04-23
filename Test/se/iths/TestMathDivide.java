package se.iths;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.After;


public class TestMathDivide {
	Lab1 lab1;
	
	@Before
	public void start (){
		lab1 = new Lab1();
	}

	@Test
	public void testDivide() {
		int sum = lab1.divide(4,2);
		assertEquals(2, sum);
		}
}
