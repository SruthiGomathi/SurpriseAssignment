/* Try the first program first. It carries the maximum number of marks!
Next, try the next ones in that order
(in simpler terms, the weightage reduces with the order of questions - so, try to solve the
first ones!)
1. 'Fourte' is a math game by Jambav (search in google playstore) -
https://play.google.com/store/apps/details?id=com.jambav.fourte&hl=en_IN&gl=US
Kindly download it, give it a try - play it for a while - understand the game and write a
program to reverse engineer the gameplay.
i.e. the gameplay is,
you are given four numbers, four operators with brackets and a resultant number.
combination of the numbers (joint or individually) along with the operators make the
resultant number.
the gameplay is to figure out the number combinations with the operator.
write a program to find out the answer to the game!
*/

package SurpirseAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JambavGame {
	static String findExpression(int[] array, int target) {
		String s = new String();
		//one digit combos
		//only addition
		if(array[0] + array[1] + array[2] + array[3] == target)
			s = Integer.toString(array[0])+"+"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		//one digit subraction combos
		//one negative number
		else if(array[0] + array[1] + array[2] - array[3] == target)
			s = Integer.toString(array[0])+"+"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"-"+Integer.toString(array[3]);
		else if(array[0] + array[1] - array[2] + array[3] == target)
			s = Integer.toString(array[0])+"+"+Integer.toString(array[1])+"-"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		else if(array[0] - array[1] + array[2] + array[3] == target)
			s = Integer.toString(array[0])+"-"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		else if(- array[0] + array[1] + array[2] + array[3] == target)
			s = Integer.toString(array[1])+"-"+Integer.toString(array[0])+"+"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		//two negative number
		else if(array[0] + array[1] - array[2] - array[3] == target)
			s = Integer.toString(array[0])+"+"+Integer.toString(array[1])+"-"+Integer.toString(array[2])+"-"+Integer.toString(array[3]);
		else if(array[0] - array[1] - array[2] + array[3] == target)
			s = Integer.toString(array[0])+"-"+Integer.toString(array[1])+"-"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		else if(-array[0] - array[1] + array[2] + array[3] == target)
			s = "-"+Integer.toString(array[0])+"-"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		else if(-array[0] + array[1] - array[2] + array[3] == target)
			s = "-"+Integer.toString(array[0])+"+"+Integer.toString(array[1])+"-"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		else if(-array[0] + array[1] + array[2] - array[3] == target)
			s = "-"+Integer.toString(array[0])+"+"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"-"+Integer.toString(array[3]);
		else if(array[0] - array[1] + array[2] - array[3] == target)
			s = Integer.toString(array[0])+"-"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"-"+Integer.toString(array[3]);
		//three negative numbers
		else if(array[0] - array[1] - array[2] - array[3] == target)
			s = Integer.toString(array[0])+"-"+Integer.toString(array[1])+"-"+Integer.toString(array[2])+"-"+Integer.toString(array[3]);
		else if(-array[0] - array[1] - array[2] + array[3] == target)
			s = "-"+Integer.toString(array[0])+"-"+Integer.toString(array[1])+"-"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		else if(-array[0] - array[1] + array[2] - array[3] == target)
			s = "-"+Integer.toString(array[0])+"-"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"-"+Integer.toString(array[3]);
		else if(-array[0] + array[1] - array[2] - array[3] == target)
			s = "-"+Integer.toString(array[0])+"+"+Integer.toString(array[1])+"-"+Integer.toString(array[2])+"-"+Integer.toString(array[3]);
		
		else if(array[0] * array[1] * array[2] * array[3] == target)
			s = Integer.toString(array[0])+"*"+Integer.toString(array[1])+"*"+Integer.toString(array[2])+"*"+Integer.toString(array[3]);
		else if(array[0] * array[1] + array[2] + array[3] == target)
			s = Integer.toString(array[0])+"*"+Integer.toString(array[1])+"+"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		else if(array[0] * array[1] * array[2] + array[3] == target)
			s = Integer.toString(array[0])+"*"+Integer.toString(array[1])+"*"+Integer.toString(array[2])+"+"+Integer.toString(array[3]);
		return s;
	}
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the four numbers ");
			int array[] = new int[4];
			for(int i=0;i<4;i++) {
				array[i] = sc.nextInt();
			}
			System.out.println("Enter the final answer needed ");
			int answer = sc.nextInt();
			System.out.println("The resultant expression is " + findExpression(array,answer));
		}
		catch(Exception e) {
			
		}
		finally {
			sc.close();
		}
	}
}
