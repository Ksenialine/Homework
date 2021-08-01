package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator{

	private static final Pattern email = Pattern.compile("\\w+@\\w+.\\w");
	
	public boolean validate(String x) {
		Matcher matcher = email.matcher(x);
		boolean result;
		if (matcher.find()) {
			System.out.println("Ваша электронная почта подходит");
			result = true;
		} else {
			System.out.println("Ваша электронная почта не подходит");
			result = false;
		}
		return result;
	}
	
	@Override
	public Pattern getPattern() {
		return email;
	}

}
