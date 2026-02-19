package JavaCollection;

import java.util.Arrays;

public class InputExample {
	static int[] solution(int[] digits) {
		int n = digits.length;

		// Traverse from last digit
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0; // carry forward
		}

		// If all digits were 9
		int[] result = new int[n + 1];
		result[0] = 1;
		return result;
	}

	// Main method for testing
	public static void main(String[] args) {
		int[] digits1 = { 1, 2, 3 };
		int[] digits2 = { 1, 2, 9 };
		int[] digits3 = { 9, 9, 9 };

		System.out.println(Arrays.toString(solution(digits1)));
		System.out.println(Arrays.toString(solution(digits2)));
		System.out.println(Arrays.toString(solution(digits3)));
	}
}
