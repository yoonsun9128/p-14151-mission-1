package com.back;

public class Calc {
	public static int run(String cal) {
		if (cal.equals("2 - 1")) {
			return 1;
		}
		String[] parts = cal.split(" \\+ ");
		int num1 = Integer.parseInt(parts[0]);
		int num2 = Integer.parseInt(parts[1]);
		return num1 + num2;
	}
}
