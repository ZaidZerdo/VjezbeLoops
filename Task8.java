package vjezbe;

public class Task8 {

	/*
	 * Find all eight digit perfect numbers.
	 * Use the fact that if (2^n - 1) is a prime (Mersenne)
	 * then 2^(n-1) * (2^n - 1) is a perfect number.
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
			int perfectNumber = prime * ((int) Math.pow(2, i - 1));
			
			if (perfectNumber >= 10000000 && perfectNumber < 100000000) {
				System.out.println(perfectNumber);
			}
		}
	}

}
