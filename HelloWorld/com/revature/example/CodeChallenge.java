package com.revature.example;

import java.io.IOException;
import java.util.Arrays;

public class CodeChallenge {
	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 *
	 * @param string
	 * @return
	 */
	public static void main(String[] args) {
		CodeChallenge c = new CodeChallenge();
		String test =c.reverse("blue");
		System.out.println(test);
	
}
	public String reverse(String string) {
		/*String thing2 = string;
		int num = string.length();
		char[] arr;
		arr = thing2.toCharArray();
		char[] newArr = new char[num];
		/*for (int i=0; i<blue.length;i++) {
			char temp;
			char temp2;
			temp = blue[i];
		for (int i=0; i<arr.length;i++) {
		int num1 = arr.length-1;
		char temp;
		temp = arr[arr.length-1];
		newArr[i]= temp;		
		}
		String thingy = String.copyValueOf(newArr);
		return thingy;
		}*/
		char hold;
		int num = string.length();
		char[] arr2 = new char[num];
		char[] arr = string.toCharArray();
		for (int i=arr.length-1; i>-1;i--) {
			hold = arr[i];
			
		for (int j = 0; j<arr.length; j++) {
			arr2[j]=hold;
			
		}
		
		}
		String thingy = String.copyValueOf(arr2);
		return thingy;
	}
}