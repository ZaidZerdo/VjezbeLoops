package vjezbe;

public class Task7 {

	/*
	 * Find all seven digit Woodall prime numbers.
	 * A Woodall prime number is a number that can be
	 * represented as n * 2^n - 1.
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 20; i++) {
			int number = i * (int) Math.pow(2, i) - 1;
			
			if (number >= 1000000 && number < 10000000) {
				System.out.println(number);
			}
		}
	}

}
