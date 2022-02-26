package com.blz.genericnumber;

public class Maximum {
	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a; 
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max; 
	}

	public static void main(String[] args) {
		
		System.out.printf("Max of %d, %d and %d is %d\n\n", 5, 6, 7, maximum(5, 6, 7));
		System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 5.7, 6.8, 7.9, maximum(5.7f, 6.8f, 7.9f));
		System.out.printf("Max of %s, %s and %s is %s\n", "Mango", "orange", "Banana",
				maximum("Mango", "orange", "Banana"));
	}


}
