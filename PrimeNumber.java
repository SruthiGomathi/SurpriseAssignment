package SurpirseAssignment;

public class PrimeNumber {
	boolean isPrime(long number) {
		if(number == 0 || number == 1)
			return false;
		for(int iterator=2;iterator<number/2;iterator++) {
			if(number%iterator == 0)
				return false;
		}
		return true;
	}
}
