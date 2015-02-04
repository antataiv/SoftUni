import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08ExtractEmails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input text here: ");
		String text = input.nextLine();
		
		//tozi regex ne raboti izcialo pravilno i za syjalenie ne mojah da go izmislia kak da e tochen
		//v momenta ne hvashta e-maili, kato no-reply@github.com (ne hvashta no- , a samo reply@github.com)
		//kakto i info-bg@software-university.software.academy (ne hvashta info-)
		//na koito mu se padne da mi proveriava domashnoto, shte sym mnogo blagodaren, ako v komentara mi napishe kak bi triabavlo da e po-pravilen (ako znae, razbira se) :)
		String emailMatcher = "([a-z0-9\\.-_]*)@([a-z0-9\\.-]+[a-z0-9])";
		Pattern pattern = Pattern.compile(emailMatcher);
		Matcher match  = pattern.matcher(text);
		
		while (match.find()) {
			System.out.println(match.group());
		}
	}
}