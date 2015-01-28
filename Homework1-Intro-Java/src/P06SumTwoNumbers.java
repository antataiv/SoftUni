import java.util.Scanner;

public class P06SumTwoNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st integer number: ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("Enter 2nd integer number: ");
		int b = Integer.parseInt(scan.nextLine());
		System.out.printf("The sum is: %d\n", a+b);
	}
}