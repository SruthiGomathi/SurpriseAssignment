/*Write a program to check whether the given two strings are anagrams of each other.
Example: String 1: Listen  String 2: Silent   
The result: Given strings are anagrams of each other */

package SurpirseAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
	static boolean isAnagram(String string1,String string2) {
		if(string1.length()!=string2.length())
			return false;
		char[] charString1 = string1.toCharArray();
		char[] charString2 = string2.toCharArray();
		Arrays.sort(charString1);
		Arrays.sort(charString2);
		for(int i=0;i<charString1.length;i++) {
			if(charString1[i] != charString2[i])
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the String 1");
			String string1 = sc.next();
			System.out.println("Enter the String 2");
			String string2 = sc.next();
			if(isAnagram(string1,string2)) {
				System.out.println("Given strings " + string1 + " and " + string2 + " are ANAGRAMS");
			}
			else
				System.out.println("Given strings " + string1 + " and " + string2 + " are NOT ANAGRAMS");
		}
		catch(Exception e) {
			
		}
		finally {
			sc.close();
		}
	}
}
