package com.paymentsystem;
import java.util.Scanner;
public class AppMain {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(",");
	        String eventName = input[0];
	        String customerName = input[1];
	        int seatCount = Integer.parseInt(input[2]);

	        EventBooking booking = new EventBooking(eventName, customerName, seatCount);

	        int paymentType = Integer.parseInt(sc.nextLine());

	        System.out.println("Stage event:" + booking.getEventName());
	        System.out.println("Customer:" + booking.getCustomerName());
	        System.out.println("Number of seats:" + booking.getSeatCount());

	        if (paymentType == 1) {
	            double amount = Double.parseDouble(sc.nextLine());
	            booking.processPayment(amount);
	        } else if (paymentType == 2) {
	            double amount = Double.parseDouble(sc.nextLine());
	            String wallet = sc.nextLine();
	            booking.processPayment(amount, wallet);
	        } else if (paymentType == 3) {
	            String name = sc.nextLine();
	            double amount = Double.parseDouble(sc.nextLine());
	            String cardType = sc.nextLine();
	            booking.processPayment(name, amount, cardType);
	        } else {
	            System.out.println("Invalid choice");
	        }
	        sc.close();
	       }
}


