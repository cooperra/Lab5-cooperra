import java.util.ArrayList;


public class PrimeFactorFinder {
	
	public static ArrayList<Integer> factor(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (n % 2 == 0) {
			primes.add(2);
		}
		if (n % 3 == 0) primes.add(3);
		return primes;
	}

}
