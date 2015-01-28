import java.util.Scanner;

public class BitCarousel_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		//byte number = Byte.parseByte(input.nextLine());
		int number = Integer.parseInt(input.nextLine());					//changed number to be int in stead of byte
		byte rotations = Byte.parseByte(input.nextLine());

		for (int i = 0; i < rotations; i++) {
			String direction = input.nextLine();

			//if (direction == "right") {
			if (direction.equals("right")) {						//should be equals in stead of ==
				int rightMostBit = number & 1;
				number >>= 1;
				//number |= rightMostBit << 6;
				number |= rightMostBit << 5;					//should be rightMostBit << (6-1) = 5 as the 6th bit is at position 5 (starting from 0, 1, 2, 3, etc.)
			}
			//else if (direction == "left") {
			else if (direction.equals("left")) {					//should be equals in stead of ==
				//int leftMostBit = (number >> 6) & 1;
				int leftMostBit = (number >> 5) & 1;			//should be number >> 5 as the 6th bit is on position 5 (starting from 0, 1, 2, 3, etc.)
				number <<= 1;
				number |= leftMostBit;
				number = number & ~(1 << 6);					//added line
			}
		}
		System.out.println(number);
	}
}