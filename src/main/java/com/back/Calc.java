package com.back;

public class Calc {
	public static int run(String cal) {
		String[] parts = cal.split(" \\+ ");
		int num1 = Integer.parseInt(parts[0]);
		int num2 = Integer.parseInt(parts[1]);
		return num1 + num2;
	}
}
