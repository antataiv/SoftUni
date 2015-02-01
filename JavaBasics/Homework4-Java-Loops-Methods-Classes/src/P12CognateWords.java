import java.util.HashSet;
import java.util.Scanner;

public class P12CognateWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("[^a-zA-Z]+");
		boolean cognateWordsFound = false;
		HashSet<String> result = new HashSet<String>();

		for (int index1 = 0; index1 < words.length; index1++) {
			for (int index2 = 0; index2 < words.length; index2++) {
				for (int index3 = 0; index3 < words.length; index3++) {
					if (index1 != index2) {
						boolean check = (words[index1] + words[index2]).equals(words[index3]);
						if (check) {
							result.add(words[index1] + "|" + words[index2] + "=" +words[index3]);
							cognateWordsFound = true;
						}
					}
				}
			}
		}

		if (!cognateWordsFound) {
			System.out.println("No");
		}
		else {
			for (String item : result) {
				System.out.println(item);
			}
		}
	}
}