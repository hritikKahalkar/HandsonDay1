/*3) Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e*/

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter one character:");
		 char a1=sc.next().charAt(0);
		System.out.println("Enter one character:");
		 char a2=sc.next().charAt(0);	
			if(a1<a2) {
				System.out.println(a1+ ","+a2);
			}
			else {
				System.out.println(a2+ ","+a1);
			}

	}

}