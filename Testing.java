import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Testing {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testFactorOne() {
		ArrayList<Integer> actual = PrimeFactorFinder.factor(1);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		assertEquals(expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}

}
