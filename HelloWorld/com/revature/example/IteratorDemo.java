package com.revature.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;



public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> exampleList=new ArrayList<Integer>();
		exampleList.add(6);
		exampleList.add(7);
		exampleList.add(92);
		exampleList.add(46);
		exampleList.add(90);
		exampleList.add(72);
		System.out.println(exampleList);
		
		//get the iterator
		Iterator<Integer> iterator1 = exampleList.iterator();
	/*
		while (i.hasNext()) {
			if(i.next()%2 != 0) {
				i.remove(); //remove odd numbers in-place
			}
			
		}*/
		System.out.println(exampleList);
		
		//step through 2 at once
		Vector<String> v = new Vector<String>(3, 2);
		
		v.addElement("red");
		v.addElement("orange");
		v.addElement("blue");
		v.addElement("green");
		
		Iterator<String> iterator2 = v.iterator();
		
		while (iterator1.hasNext() && iterator2.hasNext()) {
			System.out.println("Next value in ArrayList: " +iterator1.next());
			System.out.println("Next value in Vector: " +iterator2.next());
		}
		/*
		 * side note: && vs , || vs |
		 * doubles are short-circuit operators - second operand is not checked
		 * if...
		 * for && if first operand is false
		 * for||, if first operand is true
		 * singles are bitwise operators will check both for true
		 * preference is short-circuit (&&, ||)
		 */
	}

}
