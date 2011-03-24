import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Testing {

	@Test
	public void testFactorOne() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(1);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		assertEquals(expected, actual);
	}

	@Test
	public void testFactorTwo() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(2);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		assertEquals(expected, actual);
	}
}
