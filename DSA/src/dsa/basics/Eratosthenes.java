package dsa.basics;

import java.util.Arrays;

public class Eratosthenes {
	public static void main(String[] args) {

		int num = 30;
		Boolean[] isPrime = new Boolean[num + 1];
		Arrays.fill(isPrime, 2, isPrime.length, true);
		for (int i = 2; i < isPrime.length; i++) {
			if (i == 2 || i == 3 || i == 5)
				continue;
			else {
				if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
					isPrime[i] = false;
			}
		}
		for (int i = 2; i < isPrime.length; i++) {

			if (isPrime[i] == true)
				System.out.println(i);

		}

	}

}
