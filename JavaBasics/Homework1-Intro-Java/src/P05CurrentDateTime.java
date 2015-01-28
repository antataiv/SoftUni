import java.time.LocalDateTime;

public class P05CurrentDateTime {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		System.out.printf("\nToday is %1$td.%1$tm.%1$tY (%1$td.%1$tB.%1$tY)", LocalDateTime.now());
		System.out.printf("\nToday is %1$tA", LocalDateTime.now());
		System.out.printf("\nTime is %1$tH:%1$tM:%1$tS", LocalDateTime.now());
		System.out.printf("\nTime in US format is: %1$tl:%1$tM:%1$tS %1$tp\n", LocalDateTime.now());
	}
}