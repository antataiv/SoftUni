import java.util.Scanner;

public class P13Durts {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int centerX = input.nextInt();
		int centerY = input.nextInt();
		int radius = input.nextInt();
		int numberOfShots = input.nextInt();

		for (int i = 0; i < numberOfShots; i++) {
			int shotX = input.nextInt();
			int shotY = input.nextInt();

			boolean insideArea1 = (shotX >= (centerX - radius) && shotX <= (centerX + radius)) && (shotY >= centerY - (radius * 0.5) && shotY <= centerY + (radius * 0.5));
			boolean insideArea2 = (shotX >= centerX - (radius * 0.5) && shotX <= centerX + (radius * 0.5)) && (shotY >= (centerY - radius) && shotY <= (centerY + radius));

			if (insideArea1 || insideArea2) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}