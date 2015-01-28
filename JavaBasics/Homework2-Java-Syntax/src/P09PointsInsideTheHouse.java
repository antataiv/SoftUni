import java.util.Scanner;

public class P09PointsInsideTheHouse {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter coordinates of a point (x y): ");
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		
		boolean isInsideRect1 = (pointX >= 12.5 && pointX <= 17.5) && (pointY >= 8.5 && pointY <= 13.5);
		boolean isInsideRect2 = (pointX >= 20 && pointX <= 22.5) && (pointY >= 8.5 && pointY <= 13.5);
		
		if(isInsideRect1 || isInsideRect2 || isInsideTriangle(pointX, pointY)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
	
	//method za proverka dali dadena tochka e v triagalnik, koito vryshta true(da, vytre e) ili false(ne, ne e vytre)
	//tuk ideiata e che ako edna tochka e v triagalnik, to tia go razdelia na 3 po-malki triagalnika, chast ot golemia
	//i sbora na licata na trite po-malki triagalnika bi triabvalo da e == na liceto na golemia triagalnik. Ako ne e, znachi tochkata ne e v triagalnika
	public static boolean isInsideTriangle(double pointX, double pointY) {
		double fullTriangleArea = calcTriangleArea(17.5, 3.5, 22.5, 8.5, 12.5, 8.5);
		double subArea1 = calcTriangleArea(pointX, pointY, 22.5, 8.5, 12.5, 8.5);
		double subArea2 = calcTriangleArea(17.5, 3.5, pointX, pointY, 12.5, 8.5);
		double subArea3 = calcTriangleArea(17.5, 3.5, 22.5, 8.5, pointX, pointY);
		
		if(fullTriangleArea == (subArea1 + subArea2 + subArea3)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//izchisliavane lice na triagalnik po dadeni koordinati na 3 tochki - tuk e syshtoto kato zadacha 2, samo che izneseno v otdelen method
	//na koito pri izvikvane v programata mu se podavat koordinatite x i y na syotvetnite tochki
	public static double calcTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		double area = Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2.0);
		return area;
	}
}