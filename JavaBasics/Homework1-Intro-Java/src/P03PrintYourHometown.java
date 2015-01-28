import java.util.Scanner;

public class P03PrintYourHometown {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("My hometown is Burgas!");
		System.out.print("What is the name of your hometown? ");
		String input = scan.nextLine();
		System.out.printf("Your hometown is %s!\n", input);
	}
}