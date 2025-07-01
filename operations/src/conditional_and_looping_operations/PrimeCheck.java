package conditional_and_looping_operations;

public class PrimeCheck {
	public static void main(String[] args)
	{
		
	   int number = 7; // Change the number as needed
       int count = 0;

       for (int i = 1; i <= number; i++) {
           if (number % i == 0) {
               count++;
           }
       }

       if (count == 2) {
           System.out.println(number + " is a Prime number.");
       } else {
           System.out.println(number + " is Not a Prime number.");
       }
}
}


