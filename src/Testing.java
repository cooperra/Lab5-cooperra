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
	
	@Test
	public void testFactorThree() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(3);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		assertEquals(expected, actual);
	}
	
	// Luke
	@Test 
	public void testFactor4() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(4);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, actual);
	}
	
	// Robbie
	@Test 
	public void testFactor6() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(6);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		assertEquals(expected, actual);
	}
	
	// Luke
	@Test 
	public void testFactor8() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(8);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(2);
		expected.add(2);
		assertEquals(expected, actual);
	}
	
	// Robbie
	@Test 
	public void testFactor9() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(9);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(3);
		assertEquals(expected, actual);
	}
	
	
	// Luke
	@Test 
	public void testFactorBigNumber() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(325115);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(7);
		expected.add(7);
		expected.add(1327);
		assertEquals(expected, actual);
	}
	
	// Luke
	@Test 
	public void testGenPrimeNothing() {
		ArrayList<Integer> actual = PrimeFactorFinder.genPrime(0);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		assertEquals(expected, actual);
	}
	
	// Robbie
	@Test
	public void testGenPrime2() {
		ArrayList<Integer> actual = PrimeFactorFinder.genPrime(3);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		assertEquals(expected, actual);
	}
	
	// Luke
	@Test
	public void testGenPrime3() {
		ArrayList<Integer> actual = PrimeFactorFinder.genPrime(4);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		assertEquals(expected, actual);
	}
	
	// Robbie
	@Test
	public void testGenPrime8() {
		ArrayList<Integer> actual = PrimeFactorFinder.genPrime(8);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		assertEquals(expected, actual);
	}
	
	// Luke
	@Test
	public void testGenPrime50() {
		ArrayList<Integer> actual = PrimeFactorFinder.genPrime(50);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		assertEquals(expected, actual);
	}
}
