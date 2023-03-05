package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testsub() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(4,2), 2);

	}
	@Test
	public void testmul() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mul(4,12), 48);

	}
	@Test
	public void testdiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(12,6), 2);

	}
}
