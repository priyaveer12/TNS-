package com.airfare;

interface Airfare {
    double calculateAmount();
}

// AirIndia Class
class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    // Default Constructor
    public AirIndia() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    // Parameterized Constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Method from interface
    public double calculateAmount() {
        return hours * costPerHour;
    }
}

// KingFisher Class
class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    // Default Constructor
    public KingFisher() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    // Parameterized Constructor
    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Method from interface
    public double calculateAmount() {
        return hours * costPerHour * 4;
    }
}

// Indigo Class
class Indigo implements Airfare {
    private int hours;
    private double costPerHour;

    // Default Constructor
    public Indigo() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    // Parameterized Constructor
    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Method from interface
    public double calculateAmount() {
        return hours * costPerHour * 8;
    }
}

// Main class (Driver class)
public class Main {
    public static void main(String[] args) {
        Airfare airIndia = new AirIndia(3, 1500.5);
        Airfare kingFisher = new KingFisher(2, 2000.25);
        Airfare indigo = new Indigo(4, 1800.75);

        System.out.printf("AirIndia Total Fare: ₹%.2f\n", airIndia.calculateAmount());
        System.out.printf("KingFisher Total Fare: ₹%.2f\n", kingFisher.calculateAmount());
        System.out.printf("Indigo Total Fare: ₹%.2f\n", indigo.calculateAmount());
    }
}