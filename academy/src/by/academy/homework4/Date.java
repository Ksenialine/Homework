package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
	private CharSequence date;

	public class Year {
		private int year;
	}

	public class Monts {
		private int monts;
	}

	public class Day {
		private int day;
	}

	public static void main(String[] args) {
		Date dateFirst = new Date();

		Date.Year yearFirst = new Date().new Year();
		yearFirst.year = 2021;
		Date.Monts montsFirst = new Date().new Monts();
		montsFirst.monts = 5;
		Date.Day dayFirst = new Date().new Day();
		dayFirst.day = 20;

		dateFirst.date = "20-05-2021";

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate todayFirst = LocalDate.parse(dateFirst.date, formatter1);

		DayOfWeek dayWeekEnumFirst = todayFirst.getDayOfWeek();
		System.out.println("День недели первой даты: " + dayWeekEnumFirst);

		Date dateSecond = new Date();

		Date.Year yearSecond = new Date().new Year();
		yearSecond.year = 2021;
		Date.Monts montsSecond = new Date().new Monts();
		montsSecond.monts = 5;
		Date.Day daySecond = new Date().new Day();
		daySecond.day = 29;

		dateSecond.date = "29-05-2021";

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate todaySecond = LocalDate.parse(dateSecond.date, formatter2);

		DayOfWeek dayWeekEnumSecond = todaySecond.getDayOfWeek();
		System.out.println("День недели второй даты: " + dayWeekEnumSecond);

		System.out.println("Разница дней в заданных датах: " + (daySecond.day - dayFirst.day));

		if (yearSecond.year % 4 == 0 && (yearFirst.year % 100 != 0 || yearFirst.year % 400 == 0)) {
			System.out.println("Год високосный");
		} else {
			System.out.println("Год не високосный");
		}
	}
}
