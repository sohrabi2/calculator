package com.example.pro.lib;

import java.util.Scanner;
import java.math.*;

public class MyClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("pls enter a firstNumber");
			float firstNumber = input.nextInt();

			System.out.println("pls select an action");
			String action = input.next();

			System.out.println("pls enter next secondNumber");
			float secondNumber = input.nextInt();

			if (action.equals("=")) {
				return;
			}
			System.out.println("Result: " + getResult(firstNumber, action, secondNumber));
		}
	}//end of main method


	public static float getResult(float firstNumber, String action, float secondNumber) {
		float result = 0;
		switch (action) {
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/":
				if (secondNumber == 0) {
					System.out.println("divide by zero is not allowed.");
					break;
				}
				try {
					result = firstNumber / secondNumber;
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("action not valid");
		}
		return result;
	}

}
