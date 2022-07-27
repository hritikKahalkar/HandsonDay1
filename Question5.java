/*5) Write a program to accept gender ("Male" or "Female")  and age from the key board and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.") 
*/

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String s1 = "Male";	
		String s2 = "Female";
		System.out.println("Enter the Gender:");
		String gen = sc.nextLine();
		
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		
		if(gen.equals(s1)) {
			if(age>=1 && age<=58) {
			System.out.println("Intrest is 8.4%");
			}
			else {
				System.out.println("Intrest is 10.5%");
			}
		}
		else if(gen.equals(s2))  {
			if(age>=1 && age<=58) {
			System.out.println("Intrest is 8.2%");
			}
			else {
				System.out.println("Intrest is 9.2%");
			}
		}
		else {
			System.out.println("Invalid Input");
		}


	}

}
