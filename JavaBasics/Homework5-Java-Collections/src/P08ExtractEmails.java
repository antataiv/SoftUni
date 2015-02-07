import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08ExtractEmails {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input text here: ");
		String text = input.nextLine();
		
		String emailMatcher = "([-a-z0-9\\.-_]*)@([a-z0-9\\.-]+[a-z0-9])";
//		String emailMatcher = "\\b[a-z0-9][a-z-_\\.]+@[a-z]+\\.*[a-z\\.-]*\\w";
		Pattern pattern = Pattern.compile(emailMatcher);
		Matcher match  = pattern.matcher(text);
		
		while (match.find()) {
			System.out.println(match.group());
		}
	}
}