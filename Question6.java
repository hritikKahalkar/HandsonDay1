/*6) Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)

i/p:a

o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)

i/p:A

o/p:A->a
*/

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter one character:");
		 char ch=sc.next().charAt(0);
		 if(Character.isUpperCase(ch)) {
			 ch = Character.toLowerCase(ch);
			 System.out.println(ch);
		 }
		 else {
			 ch = Character.toUpperCase(ch);
			 System.out.println(ch);
		 }


	}

}