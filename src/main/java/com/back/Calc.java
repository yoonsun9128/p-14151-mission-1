package com.back;

public class Calc {
	public static int run(String cal) {
		String[] parts;
		boolean type = true;
		if (cal.contains("+")) {
			parts = cal.split(" \\+ ");
		} else {
			parts = cal.split(" \\- ");
			type = false;
		}
		int num1 = Integer.parseInt(parts[0]);
		int num2 = Integer.parseInt(parts[1]);
		if (type) {
			return num1 + num2;
		} else {
			return num1 - num2;
		}
	}
}
