package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{

	private static final Pattern belNumber = Pattern.compile("\\[+375][0-9]{9}");
	
	public boolean validate(String x) {
		Matcher matcher = belNumber.matcher(x);
		boolean result;
		if (matcher.find()) {
			System.out.println("Ваш номер подходит");
			result = true;
		} else {
			System.out.println("Ваш номер не белорусский");
			result = false;
		}
		return result;
	}
	@Override
	public Pattern getPattern() {
		return belNumber;
	}

}
