package javaBasics;

public class AlternatingSums {
	static int[] solution(int[] a) {
		int team1 = 0;
		int team2 = 0;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				team1 += a[i];
			} else {
				team2 += a[i];
			}
		}

		return new int[] { team1, team2 };
	}

	public static void main(String[] args) {
		int[] a = { 50, 60, 60, 45, 70 };
		int[] result = solution(a);

		System.out.println("[" + result[0] + ", " + result[1] + "]");
	}
}
