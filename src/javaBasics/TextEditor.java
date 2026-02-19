package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TextEditor {
	static String[] solution(String[] operations) {
		List<String> result = new ArrayList<>();
		Stack<String> history = new Stack<>();

		String text = "";

		for (String op : operations) {
			if (op.startsWith("INSERT")) {
				history.push(text); // save state
				String toInsert = op.substring(7); // after "INSERT "
				text += toInsert;
			} else if (op.equals("BACKSPACE")) {
				history.push(text); // save state
				if (!text.isEmpty()) {
					text = text.substring(0, text.length() - 1);
				}
			} else if (op.equals("UNDO")) {
				if (!history.isEmpty()) {
					text = history.pop();
				}
			}

			result.add(text);
		}

		return result.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String[] operations = { "INSERT Code", "INSERT Signal", "BACKSPACE", "UNDO" };

		String[] output = solution(operations);
		System.out.println(Arrays.toString(output));
	}
}
