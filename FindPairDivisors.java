/* Given an array of integers and a positive integer k, determine the number of (i,j) pairs
where i < j and ar[i] + ar[j] is divisible by k.
Constraints:
2 <= n <= 100
1 <= k <= 100
1 <= ar[i] <= 100
Example :-
ar = [1,2,3,4,5,6]
 
k = 5
Three pairs meet the criteria:[1,4],[2,3] and [4,6] */

package SurpirseAssignment;

import java.util.Scanner;

public class FindPairDivisors {
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the number of digits in the array ");
			int number = sc.nextInt();
			System.out.println("Enter the elements in the array ");
			int array[] = new int[number];
			for(int i=0;i<number;i++) {
				array[i] = sc.nextInt();
			}
			System.out.println("Enter the value of k for which the pair divisors is to be found ");
			int k = sc.nextInt();
			for(int i=0;i<number-1;i++) {
				for(int j=i+1;j<number;j++) {
					if((array[i] + array[j]) % k == 0)
						System.out.println("[" + array[i] + "," + array[j] + "]");
				}
			}
		}
		catch(Exception e) {
			
		}
		finally {
			sc.close();
		}
	}
}
