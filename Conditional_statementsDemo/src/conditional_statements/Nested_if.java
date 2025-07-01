package conditional_statements;

public class Nested_if {

	public static void main(String[] args) {
		int number = 8;

        if (number > 0) {
            System.out.println("The number is positive.");

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            }
        }
    }
}
