import java.util.*;

public class P09CombineListsOfLetters {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first text of characters: ");
		String[] firstLineInput = input.nextLine().trim().split(" ");
		System.out.println("Enter the second text of characters: ");
		String[] secondLineInput = input.nextLine().trim().split(" ");

		ArrayList<Character> firstArray = new ArrayList<Character>();
		ArrayList<Character> secondArray = new ArrayList<Character>();

		for (String letter : firstLineInput) {
			firstArray.add(letter.charAt(0));
		}
		for (String letter : secondLineInput) {
			secondArray.add(letter.charAt(0));
		}

		secondArray.removeAll(firstArray);
		firstArray.addAll(secondArray);

		for (Character letter : firstArray) {
			System.out.print(letter + " ");
		}
	}
}