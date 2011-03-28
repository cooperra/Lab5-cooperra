import java.util.ArrayList;


public class PrimeFactorFinder {
	
	public static ArrayList<Integer> factor(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		while (n % 2 == 0) {
			primes.add(2);
			n /= 2;
		}
		while (n % 3 == 0) {
			primes.add(3);
			n /= 3;
		}
		return primes;
	}

}
