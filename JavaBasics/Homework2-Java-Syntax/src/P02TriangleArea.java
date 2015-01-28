import java.util.Scanner;

public class P02TriangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter coordinates of point A (x y): ");
		int aX = input.nextInt();
		int aY = input.nextInt();
		System.out.print("Enter coordinates of point B (x y): ");
		int bX = input.nextInt();
		int bY = input.nextInt();
		System.out.print("Enter coordinates of point C (x y): ");
		int cX = input.nextInt();
		int cY = input.nextInt();
		
		int area = (aX*(bY-cY) + bX*(cY-aY) + cX*(aY-bY)) / 2;
		
		if(area != 0) {
			System.out.println("Triangle are is: " + Math.abs(area));
		}
		else {
			System.out.println("0");
		}
	}
}