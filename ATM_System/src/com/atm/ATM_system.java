package com.atm;
import java.util.Scanner;


public class ATM_system {

 public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
	        double balance = 10000.0;  // Initial balance
	        int choice;

	        while (true) {
	            // Updated Menu
	            System.out.println("=== ATM Menu ===");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    // Check balance
	                    System.out.println("Current Balance: ₹" + balance);
	                    break;

	                case 2:
	                    // Withdraw
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = sc.nextDouble();
	                    if (withdrawAmount <= 0) {
	                        System.out.println("Invalid amount.");
	                    } else if (withdrawAmount > balance) {
	                        System.out.println("Insufficient balance.");
	                    } else {
	                        balance -= withdrawAmount;
	                        System.out.println("Withdrawal successful.");
	                        System.out.println("New Balance: ₹" + balance);
	                    }
	                    break;

	                case 3:
	                    // Deposit
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = sc.nextDouble();
	                    if (depositAmount <= 0) {
	                        System.out.println("Invalid deposit amount.");
	                    } else {
	                        balance += depositAmount;
	                        System.out.println("Deposit successful.");
	                        System.out.println("New Balance: ₹" + balance);
	                    }
	                    break;

	                case 4:
	                    // Exit
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please enter 1 to 4.");



	}
	        }
 }
}


