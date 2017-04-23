package se.iths;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.After;


public class TestMathMultiply {
	Lab1 lab1;
	
	@Before
	public void start (){
		lab1 = new Lab1();
	}

	@Test
	public void testMultiply() {
		int sum = lab1.multiply(2,4);
		assertEquals(8, sum);
		}
}
