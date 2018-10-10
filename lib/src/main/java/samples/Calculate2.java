package samples;

import java.util.Scanner;

public class Calculate2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter a number then press Enter:");
		float firstNumber = input.nextFloat();

		float result = firstNumber;
		for (int i = 0 ; true ; i++) {
			System.out.println("Please enter an action then press Enter:");
			String action = input.next();

			if (i == 0 && action.equals("=")) {
				System.out.println("OOOOOOPS!!!!!! Action is invalid.");
				return;
			} else if (action.equals("=")) {
				System.out.println("Result: " + result);
				return;
			}

			System.out.println("please enter another number then press Enter:");
			float secondNumber = input.nextFloat();

			result = getResult(result, action, secondNumber);
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
