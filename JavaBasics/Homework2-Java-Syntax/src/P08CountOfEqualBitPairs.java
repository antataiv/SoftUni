import java.util.Scanner;

public class P08CountOfEqualBitPairs {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int pairsFound = 0;

		//variant 1 sys String
		String nToBin = Integer.toBinaryString(n);
		for (int i = 0; i < nToBin.length() - 1; i++) {
			if(nToBin.charAt(i) == nToBin.charAt(i + 1)) {
				pairsFound++;
			}
		}

		//variant 2 sys bitove
//		int mask = 3;		//bin representation - 11
//		while (n > 2) {
//			if ((n & mask) == 3 || (n & mask) == 0) {
//				pairsFound++;
//			}
//			n = n >> 1;
//		}
		
		System.out.println("Equal bit pairs 00 or 11 found: " + pairsFound);
	}
}