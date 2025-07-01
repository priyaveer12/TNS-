package conditional_and_looping_operations;

import java.util.Scanner;

public class BloodDonation_EligibiltyCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if(18 <=age  &&  age<= 65)
		{
			System.out.println("Eligible for blood donation");
		}
		else
		{
			System.out.println("Not eligible for blood donation");
		}
	}

}
