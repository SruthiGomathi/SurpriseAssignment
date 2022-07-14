/* Write a program to find the first 10 fibonacci numbers that are also prime
*/

package SurpirseAssignment;

import java.util.Scanner;

public class FibonacciPrimeNumbers {
	void findFibonacci(long number) {
		long prev = 0;
		long next = 1;
		PrimeNumber pn = new PrimeNumber();
		for(long i=0;i<number;i++) {
			long temp = prev+next;
			if(pn.isPrime(temp))
				System.out.println(temp);
			prev = next;
			next = temp;
		}
	}
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the number until which the fibonacci should execute ");
			long number = sc.nextLong();
			FibonacciPrimeNumbers fpn = new FibonacciPrimeNumbers();
			fpn.findFibonacci(number);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
