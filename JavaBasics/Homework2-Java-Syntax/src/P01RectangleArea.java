import java.util.Scanner;

public class P01RectangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side A: ");
		int sideA = Integer.parseInt(input.nextLine());
		System.out.print("Enter side B: ");
		int sideB = Integer.parseInt(input.nextLine());
		
		System.out.printf("Area is: %d", sideA * sideB);
	}
}