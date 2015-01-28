import java.util.Scanner;

public class P05DecimalToHexadecimal {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value of a number: ");
		int num = input.nextInt();
		String hex = Integer.toHexString(num);
		
		System.out.printf("The hex representation of %d is %S", num, hex);
	}
}