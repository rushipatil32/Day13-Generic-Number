package com.blz.genericnumber;

public class Maximum<T extends Comparable<T>> {
	/*
	 * This generic method is used to find max among more than 3 variables of
	 * Generic Type
	 */
	@SafeVarargs
	public static <T extends Comparable<T>> T testMaximum(T... value) {
		T max = value[0]; // assume a is initially the largest
		
		for (int i = 1; i < value.length; i++) {
			if (value[i].compareTo(max) > 0) {
				max = value[i];
			}
		}
		System.out.println("given values are : ");
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		printMax(max);
		return max; 
	}
	public static <T> void printMax(T max) {
		System.out.println("\nMaximum Value is= " + max + "\n");
	}

	public static void main(String[] args) {
		Maximum.<Integer>testMaximum(6, 7, 8, 9, 54, 76, 43);

		Maximum.<Float>testMaximum(5.6f, 6.7f, 7.8f, 8.9f);

		Maximum.<String>testMaximum("Mango", "orange", "Banana", "Apple", "Grapes");
	}
}