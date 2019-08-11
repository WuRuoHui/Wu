package com.luogu;

import java.util.Arrays;

public class Threeboule {
	public static void main(String[] args) {
		int b;
		int c;
		String s;
		char[] chars;
		for (int i = 123; i < 329; i++) {
			b = 2 * i;
			c = 3 * i;
			if (String.valueOf(i).endsWith("0")) {
				continue;
			}
			s = String.valueOf(i)+String.valueOf(b)+String.valueOf(c);
			chars = s.toCharArray();
			Arrays.sort(chars);
			if (String.valueOf(chars).equals("123456789")) {
				System.out.println(i+" " +b + " " +c);
			}
		}
	}
}
