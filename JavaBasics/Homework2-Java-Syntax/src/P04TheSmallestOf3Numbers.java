import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P04TheSmallestOf3Numbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//zapisvam chislata v edin masiv
		ArrayList<Double> numbers = new ArrayList<Double>();
		System.out.print("Enter 1st number: ");
		numbers.add(Double.parseDouble(input.nextLine()));
		System.out.print("Enter 2nd number: ");
		numbers.add(Double.parseDouble(input.nextLine()));
		System.out.print("Enter 3rd number: ");
		numbers.add(Double.parseDouble(input.nextLine()));
		
		//sortiram masiva
		Collections.sort(numbers);
		
		//izpisvam pyrvia element, tai kato masiva e sortiran vyzhodiashto i ochevidno pyrvia element e nai-malyk
		System.out.println("The smallest number is: " + numbers.get(0));
	}
}