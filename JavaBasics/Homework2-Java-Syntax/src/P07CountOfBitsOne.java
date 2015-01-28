import java.util.Scanner;

public class P07CountOfBitsOne {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		//variant 1 sys String
		String nToBin = Integer.toBinaryString(n);
		int count = 0;
		
		for (int i = 0; i < nToBin.length(); i++) {
			if(nToBin.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
		
		//variant 2 - bitCount() method
		int numberOf1Bits = Integer.bitCount(n);
		System.out.println(numberOf1Bits);
	}
}