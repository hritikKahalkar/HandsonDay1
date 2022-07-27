/*1) Write a program to check if a given integer number is Positive, Negative, or Zero.*/

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("It is Negative");
		}
		else if(num>0) {
			System.out.println("It is Positive");
		}
		else {
			System.out.println("It is Zero");
		}

	}

}
