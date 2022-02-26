package com.blz.genericnumber;

public class Maximum {
	public static Float maxFloat(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		System.out.println("First Number= " + a);
		System.out.println("Second Number= " + b);
		System.out.println("Thrird Number= " + c);
		System.out.println("Maximum Value is= " + max);
		return max;
	}
	
	public static void main(String[] args) {
		Maximum.maxFloat(5.7f, 6.8f, 7.9f);
	}
}