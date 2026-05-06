package com.back;

public class Calc {
	public static int run(String cal) {
		String[] parts;

		parts = cal.split("\\s");

		int result = Integer.parseInt(parts[0]);
		for (int i = 1; i < parts.length; i += 2) {
			String op = parts[i];          // "+", "-"
			int num = Integer.parseInt(parts[i + 1]);

			if (op.equals("+")) {
				result += num;
			} else if (op.equals("-")) {
				result -= num;
			}
		}

		return result;

	}
}
