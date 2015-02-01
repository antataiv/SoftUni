import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class P07DaysBetweenTwoDates {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.print("Enter start date: ");
		String start = input.nextLine();
		//ako datata e 1-01-2014 da dobavi oshte edna nula otpred, za da stane 01-01-2014. Inache gyrmi pri parsevaneto
		if(start.length() == 9) {
			start = "0" + start;
		}
		
		System.out.print("Enter end date: ");
		String end = input.nextLine();
		//ako datata e 1-01-2014 da dobavi oshte edna nula otpred,  za da stane 01-01-2014. Inache gyrmi pri parsvaneto
		if (end.length() == 9) {
			end = "0" + end;
		}
		
		LocalDate startDate = LocalDate.parse(start, format);
		LocalDate endDate = LocalDate.parse(end, format);
		
		System.out.println(ChronoUnit.DAYS.between(startDate, endDate));
	}
}