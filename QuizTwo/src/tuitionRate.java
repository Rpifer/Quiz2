import java.util.Scanner;

public class tuitionRate {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Percent increase per year (e.g., .07): ");
		double increase = input.nextDouble();
		System.out.println("Starting tuition (e.g, 12000): ");
		double tuition = input.nextDouble();
		double sum = 0;
		//Loops for 4 years, adding tuition to sum and increasing tuition
		for (int i = 1; i < 5; i++) {
			sum += tuition;
			tuition = tuition * (1 + increase);
		}
		//This will print the number, whatever the length with 2 decimal places
		System.out.printf("Your tuition after 4 years will be $%.2f", sum);
	}
}
