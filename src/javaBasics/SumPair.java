package javaBasics;

import java.util.HashSet;

public class SumPair {

	static int solution(int[] a) {
		int count = 0;

		// Store all elements for O(1) lookup
		HashSet<Integer> set = new HashSet<>();
		for (int num : a) {
			set.add(num);
		}

		// Check all pairs (i < j)
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (set.contains(sum)) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 3, 2, 5 };
		System.out.println(solution(a)); // Output: 4
	}

}
