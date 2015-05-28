package vjezbe;

public class Task10 {

	/*
	 * Find all ten digit Fermat's numbers.
	 * A Fermat's number is a number that can be
	 * represented as 2^(2^n) + 1.
	 */
	public static void main(String[] args) {
		for (long i = 1; i < 30; i++) {
			long number = (long) Math.pow(2, Math.pow(2, i)) + 1;
			
			if (number >= 1000000000 && number / 10 < 1000000000) {
				System.out.println(number);				
			}
		}
	}

}
