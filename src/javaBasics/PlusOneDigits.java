package javaBasics;

import java.util.Arrays;

public class PlusOneDigits {
	static int[] solution(int[] digits) {
        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // carry over
        }

        // If all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = solution(digits);

        System.out.println(Arrays.toString(result));
    }
}
