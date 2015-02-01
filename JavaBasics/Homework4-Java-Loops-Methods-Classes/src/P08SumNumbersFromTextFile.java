import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class P08SumNumbersFromTextFile {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int sum = 0;

		try {
			Scanner input = new Scanner(new File("Input.txt"));
			while (input.hasNext()) {
				nums.add(Integer.parseInt(input.nextLine().trim()));
			}
			input.close();

			for (Integer number : nums) {
				sum += number;
			}
			System.out.println(sum);
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}
}