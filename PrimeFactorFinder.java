import java.util.ArrayList;

public class PrimeFactorFinder {

	public static ArrayList<Integer> factor(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int factor = 2;
		do {
			while (n % factor == 0) {
				primes.add(factor);
				n /= factor;
			}
			factor++;			
		} while (factor <= n);
		return primes;
	}
}
