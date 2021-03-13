package calculadora;

import java.util.Scanner;

public class Calculadora_metodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the first number: ");
	    int number1 = Integer.valueOf(scanner.nextLine());

	    System.out.print("Enter the second number: ");
	    int number2 = Integer.valueOf(scanner.nextLine());

	    System.out.print("The total sum of the numbers is: " + sum(number1, number2));
	}

	public static int sum(int first, int second) {
	    return first + second;
	}
}