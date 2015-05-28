package vjezbe;

public class Task6 {

	/*
	 * Print all six-digit Mersenne prime numbers.
	 * Mersenne primes are numbers that can be represented
	 * as 2^n - 1, where n is also a prime number.
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 20; i++) {
			boolean isPrime = true;
			
			for (int j = 2; j < i && isPrime; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			
			int prime = (int) (Math.pow(2, i) - 1);
			
			// Print if it has six digits
			if (prime >= 100000 && prime < 1000000) {
				System.out.println(prime);
			}
		}
	}

}
