import java.util.ArrayList;
import java.util.Scanner;

public class BePositive_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		//int countSequences = scn.nextInt();
		int countSequences = Integer.parseInt(scn.nextLine());		//should be parsing the whole line

		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split(" ");
			ArrayList<Integer> numbers = new ArrayList<>();

			for (int j = 0; j < input.length; j++) {
				if (!input[j].equals("") ) {
					//int num = Integer.parseInt(input[i]);
					int num = Integer.parseInt(input[j]);			//should be parsing input[j], not input[i]
					numbers.add(num);	
				}							
			}

			boolean found = false;

			for (int j = 0; j < numbers.size(); j++) {				
				int currentNum = numbers.get(j);

				//if (currentNum > 0) {
				if (currentNum >= 0) {					//currentNum can be non-negative, meaning it can be 0
					//System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? " " : "\n");
					System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");		//" " : "\n" should be reversed - "\n" : " " in stead of " " : "\n"
					found = true;
				} else {
					if (j + 1 <= numbers.size() - 1) {					//we should make sure that j does not go outside of the size of numbers array
						currentNum += numbers.get(j + 1);					
						j++;		//j should be incremented as we need to proceed with the number after j+1

						if (currentNum >= 0) {			//currentNum should be non-negative, meaning it can be 0
							//System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? " " : "\n");
							System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
							found = true;
						}
					}
				}
			}

			if (!found) {
				System.out.println("(empty)");
			}
		}
	}
}