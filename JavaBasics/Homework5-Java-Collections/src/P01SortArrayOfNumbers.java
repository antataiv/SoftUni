import java.util.*;

public class P01SortArrayOfNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many numbers will be sorted: ");
		int n = input.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}