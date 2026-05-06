package com.back;

public class Calc {
	public static int run(String cal) {
		String[] parts;
		boolean type = true;
		int result = 0;
		if (cal.contains("+")) {
			parts = cal.split(" \\+ ");
		} else {
			parts = cal.split(" \\- ");
			type = false;
		}
		if (type) {
			for (String part :parts) {
				int num1 = Integer.parseInt(part);
				result+=num1;
			}
			return result;
		} else {
			int num1 = Integer.parseInt(parts[0]);
			int num2 = Integer.parseInt(parts[1]);
			return num1 - num2;
		}
	}
}
