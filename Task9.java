package vjezbe;

public class Task9 {

	/*
	 * Find all nine digit Fibonacci numbers.
	 */
	public static void main(String[] args) {
		long first = 1;
		long second = 1;
		
		for (;;) {
			second = first + second;
			first = second - first;
			
			if (first >= 100000000 && first < 1000000000) {
				System.out.println(first);
			} else if (first >= 1000000000) {
				break;
			}
		}		
	}

}
