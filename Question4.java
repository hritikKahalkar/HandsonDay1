/*4) Initialize a character variable in a program and

print 'Alphabhet' if the initialized value is an alphabhet,

print 'Digit' if the initialized value is a number, and

print 'Special Character', if the initialized value is anything else.*/

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter one character:");
		 char ch=sc.next().charAt(0);
		 if(ch>='a' && ch<='z') {
			 System.out.println("It is an alphabet");
		 }
		 else if(ch>='0' && ch<='9') {
			 System.out.println("It is a digit");
		 }
		 else {
			 System.out.println("It is Special Character");
		 }

	}

}