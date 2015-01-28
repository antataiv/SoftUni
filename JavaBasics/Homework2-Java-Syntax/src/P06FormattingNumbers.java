import java.util.Scanner;

public class P06FormattingNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		int a = input.nextInt();
		System.out.print("Enter 1st floating point number: ");
		double b = input.nextDouble();
		System.out.print("Enter 2nd floating point number: ");
		double c = input.nextDouble();
		
		String padded = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		System.out.printf("|%1$-10S|" + padded + "|%2$10.2f|%3$-10.3f|\n", Integer.toHexString(a), b, c);
	}
}