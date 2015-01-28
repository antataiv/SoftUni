import java.util.Scanner;

public class Substring_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		int jump = Integer.parseInt(input.nextLine());

		//char search = 'р';							//not needed as it is not used further
		boolean hasMatch = false;

		for (int i = 0; i < text.length(); i++) {

			//if (text.charAt(i) == search) {
			if (text.charAt(i) == 'p') {			//should be compared directly to the character, as comparing == to search, compares the memory references
				hasMatch = true;

				//int endIndex = jump;
				int endIndex = i + jump + 1;

				if (endIndex > text.length()) {
					endIndex = text.length();
				}
				
				String matchedString = text.substring(i, endIndex);
				System.out.println(matchedString);
				i += jump;
			}
		}

		if (!hasMatch) {
			System.out.println("no");
		}
	}
}