package by.academy.homework3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AmericanPhoneValidator implements Validator {

	private static final Pattern amNumber = Pattern.compile("\\[+1][0-9]{10}");

	public boolean validate(String x) {
		Matcher matcher = amNumber.matcher(x);
		boolean result;
		if (matcher.find()) {
			System.out.println("Ваш номер подходит");
			result = true;
		} else {
			System.out.println("Ваш номер не американский");
			result = false;
		}
		return result;
	}

	@Override
	public Pattern getPattern() {
		return amNumber;
	}

}
