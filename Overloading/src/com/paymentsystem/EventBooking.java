package com.paymentsystem;

public class EventBooking {
	private String eventName;
    private String customerName;
    private int seatCount;

    public EventBooking() {}

    public EventBooking(String eventName, String customerName, int seatCount) {
        this.eventName = eventName;
        this.customerName = customerName;
        this.seatCount = seatCount;
    }

    public String getEventName() {
        return eventName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getSeatCount() {
        return seatCount;
    }

    // Payment by Cash
    public void processPayment(double amount) {
        System.out.printf("Amount paid in cash\n", +amount);
    }

    // Payment by Wallet
    public void processPayment(double amount, String walletNumber) {
        System.out.printf("Amount paid using wallet number\n", amount, walletNumber);
    }
    // Payment by Credit Card
    public void processPayment(String holderName, double amount, String cardType) {
        System.out.println("Holder name:" + holderName);
        System.out.printf("Amount 1f paid using card\n", amount, cardType);
       }
}
