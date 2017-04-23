package se.iths;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.After;


public class TestMathAdd {
	Lab1 lab1;
	
	@Before
	public void start (){
		lab1 = new Lab1();
	}

	@Test
	public void testAdd() {
		int sum = lab1.add(2,4);
		assertEquals(6, sum);
		}
}
