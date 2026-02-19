package javaBasics;

public class IPv4Validator {
	static boolean solution(String inputString) {
		String[] parts = inputString.split("\\.");

		// Must have exactly 4 parts
		if (parts.length != 4)
			return false;

		for (String part : parts) {
			// Empty part check
			if (part.length() == 0)
				return false;

			// Leading zero check
			if (part.length() > 1 && part.startsWith("0"))
				return false;

			// Digits only
			for (char c : part.toCharArray()) {
				if (!Character.isDigit(c))
					return false;
			}

			// Range check
			int value = Integer.parseInt(part);
			if (value < 0 || value > 255)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String input = "172.16.254.1";
		System.out.println(solution(input)); // true
	}
}
