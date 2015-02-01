import java.util.Scanner;

public class P05AngleUnitConverter {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of conversions to be done: ");
		int n = Integer.parseInt(input.nextLine());

		for (int i = 0; i < n; i++) {
			String[] inputLine = input.nextLine().split(" ");
			if (inputLine[1].equals("rad")) {
				double radToDeg = (Double.parseDouble(inputLine[0]) * 180) / Math.PI;
				System.out.printf("%.6f deg\n", radToDeg);
			}
			else if (inputLine[1].equals("deg")) {
				double degToRad = (Double.parseDouble(inputLine[0]) * Math.PI) / 180;
				System.out.printf("%.6f rad\n", degToRad);
			}
		}
	}
}