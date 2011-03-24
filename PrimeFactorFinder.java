import java.util.ArrayList;


public class PrimeFactorFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<Integer> factor(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (n % 2 == 0) {
			primes.add(2);
		}
		return primes;
	}

}
