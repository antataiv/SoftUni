import java.util.Scanner;

public class P03PointsInsideAFigure {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point coordinates (x y): ");
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		
		if	(((pointX >= 12.5 && pointX <= 22.5) && (pointY >= 6 && pointY <= 8.5)) ||
			((pointX >= 12.5 && pointX <= 17.5) && (pointY >= 8.5 && pointY <= 13.5)) ||
			((pointX >= 20 && pointX <= 22.5) && (pointY >= 8.5 && pointY <= 13.5))) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}