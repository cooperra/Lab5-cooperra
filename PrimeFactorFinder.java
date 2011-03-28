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

	public static ArrayList<Integer> genPrime(int n) {
		ArrayList<Integer> returner = new ArrayList<Integer>();
		for (int x = 2; x < n; x++) {
			Boolean isPrime = true;
			for (int y = 2; y < x; y++) {
				if (x % y == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				returner.add(x);
			}
		}
		return returner;
	}
}
