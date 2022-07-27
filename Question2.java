/* 2) Write a program to check if a given integer number is odd or even.*/

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("It is Even");
		}
		else {
			System.out.println("It is Odd");
		}

	}

}
