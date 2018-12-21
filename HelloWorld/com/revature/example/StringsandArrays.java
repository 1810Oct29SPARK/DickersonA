package com.revature.example;

import java.util.Arrays;

public class StringsandArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//funWithStrings();
		funWithArrays();
	}
	static void funWithStrings() {
		//
		String a = "Hello";
		String b = new String("Hello");
		
		/*
		 * .equals is inherited from object most every reference type of 
		 *overrides to define "equality" by the fields.
		 *String has it overridden to check the string literal 
		 *know the difference between .equal and ==
		 */
		System.out.println("string a is equal ot string b:" + a.equals(b));
		
		/*
		 * double equal is good for comparing primitives
		 * or checing whether two objects are the same object
		 * (it will compare the REFERENCE)
		 */
		System.out.println("String a is the same object as String b: " + (a==b));
		//a and b are two different objects pointing to the same literal in the string pool
		/*
		 * String API methods
		 * substring
		 * concat
		 * toUpperCase
		 * toLowerCase
		 * replace
		 * indexOf
		 * split
		 * trim
		 * and many more
		 */
	
		String test1 = "hello world";
		System.out.println(test1.toUpperCase());
		String test2 = "HeLlO WorLD";
		System.out.println(test2.toLowerCase());
		System.out.println(test1.substring(3,8));
		System.out.println(test1.concat(test2));
		System.out.println(test1.replace('l', 'w'));
		System.out.println(test1.indexOf('l'));//case sensitive btw
		String test3 = "the.quick.brown.fox.jumped.over.the.lazy.dog";
		String [] words = test3.split(".");
		for (String w : words) { //augmented for loop can move through any array or collection like this
			System.out.println(w);
		}
	}
	
	static void funWithArrays() {
		String[] arr1 = {"this", "is", "an", "array"};
		/*
		 * augmented(enhance) for loops - moving throuh an Array or Iterable
		 */
		for (String s: arr1) {
			System.out.println(s);
		}
		String[] arr2 = new String[4];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = "element" +i;
		}
	System.out.println(arr2.toString());
	System.out.println(Arrays.toString(arr2));
	
	int[][] arr3 = new int[4][3];
	arr3[0][0] = 7;
	arr3[0][2] = 8;
	arr3[3][0] = 9;
	arr3 [3][2] = 10;
	
	for (int[] a : arr3) {
		System.out.println(Arrays.toString(a));
	}
	}

}
