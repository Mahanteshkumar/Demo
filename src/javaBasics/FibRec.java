package javaBasics;

public class FibRec {
	static int solution(int n) {
		// Base cases
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		int prev = 0;
		int curr = 1;
		// Iterative computation
		for (int i = 2; i <= n; i++) {
			int next = prev+curr;
			prev = curr;
			curr = next;
		}

		return curr;
	}

	public static void main(String[] args) {
		int n = 7;
		System.out.println(solution(n)); // Output: 1
	}
}
