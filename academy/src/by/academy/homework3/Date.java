package by.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите дату:");
		String date = scanner.nextLine();

		Pattern pattern = Pattern.compile("\\d{2}(/|-)\\d{2}(/|-)\\d{4}");
		Matcher matcher = pattern.matcher(date);
		boolean b = matcher.matches();

		while (matcher.find()) {
			System.out.println(date.substring(matcher.start(), matcher.end()));
		}
		System.out.println(b);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(date, formatter1);

		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();

		System.out.println("День: " + "<" + day + ">");
		System.out.println("Месяц: " + "<" + month + ">");
		System.out.println("Год: " + "<" + year + ">");
		scanner.close();
		
	}
}
