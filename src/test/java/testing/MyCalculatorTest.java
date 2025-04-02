package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.MyCalculator;

public class MyCalculatorTest {
	
	MyCalculator calc = new MyCalculator();

	@Test
	public void testSum() {
		assertEquals(30, calc.sum(20, 10));
		assertEquals(5, calc.sum(2, 3));		
	}
	
	@Test
	public void testDiff() {
		assertEquals(10, calc.diff(20, 10));
		assertEquals(-1, calc.diff(2, 3));		
	}

}
