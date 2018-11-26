package com.revature.example;

public class Controlflow {
	public static void main(String[] args) {
		//ifStatements(7.5,300);
		//forLoops();
		//whileLoops();
		switchCases();
	}
	static void ifStatements(double a, double b) {
		
		
		//can have as many else-ifs as you want!
		if (a > b) {
			System.out.println("A is greater than b");
		}
		else if (a == b) {
			System.out.println("A is equal to b");
		}
		else {
			System.out.println("A is less than b");
		}
	}
	
	static void forLoops() {
		
		//simple loop
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		//does nothing, forever
		/*
		for(;;) {
			
		}*/
		//break and continue
		//break exits the structure
		//(terminates for, while, and do-while
		//continue goes to the next iteration;
		System.out.println("Even Numbers");
		for (int j=0;;j++) {
			if (j%2!=0) {
			continue;
			}
			System.out.println(j);
			if (j==20) {
				break;
			}
		}
	}
	
	static void whileLoops() {
		//this is infinite, using break to make it finite
		int i=0;
		while (true) {
			System.out.println(i);
			i+=1;
			if (i>150) {
				break;
			}
		}
		do {
			System.out.println("do block always runs before condition is checked");
		} while(false);
	}
	static void switchCases() {
		/*
		 * switch statement allows us to execute different behavior based on an expression
		 * can be a byte, short, char, int data type, Enum, String, wrapper class
		 * wrapper class being a reference to a primitive class through auto-boxing and auto-unboxing
		 */
		String dayOfWeek = "Bam";
			switch(dayOfWeek) {
			case "Sunday":
				System.out.println("Today is Sunday");
			break;	
			case "Monday":
				System.out.println("Today is Monday");
			break;
			case "Tuesday":
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday":
				System.out.println("Today is Wednesday");
			break;
			case "Thursday":
				System.out.println("Today is Thursday");
			break;
			case "Friday":
				System.out.println("Today is Friday");
			break;
			case "Saturday":
				System.out.println("Today is Saturday");
			break;
			default:
				System.out.println("Today is just hot");
			}
	}
}
			
	
