package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import calc.Calculator;
import calc.UnknownOperatorException;

public class CalcApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		boolean readOperation = false;
		double a = 0;
		double b = 0;
		String operator = null;
		while (readOperation == false) {
			try {
				System.out.println("Podaj pierwsz¹ liczbê");
				a = input.nextDouble();
				input.nextLine();
				System.out.println("Podaj operator dzia³ania (+,-,*,/)");
				operator = input.nextLine();
				System.out.println("Podaj drug¹ licznê");
				b = input.nextDouble();
				readOperation = true;
			} catch (InputMismatchException e) {
				System.out.println("Wprowadzono niepoprawne dane");
			}
		}

		Calculator calc = new Calculator();
		double result = 0;
		boolean calcResult = false;
		try {
			result = calc.calculate(a, b, operator);
			calcResult = true;

		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (UnknownOperatorException e) {
			System.err.println(e.getMessage());
		}
		if (calcResult) {
			System.out.println(a + operator + b + " = " + result);
		} else {
			System.out.println("Obliczenie wyra¿enia bylo niemozliwe");
		}
		input.close();
	}
}