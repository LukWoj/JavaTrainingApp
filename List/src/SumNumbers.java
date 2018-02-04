/**
 * Napisz program, kt�ry pozwoli zsumowa� dowoln� ilo�� liczb od u�ytkownika.
 * Aplikacja powinna przesta� wczytywanie liczb, gdy u�ytkownik wprowadzi
 * polecenie "exit". Po wczytaniu liczb wy�wietl je na ekranie oraz podaj wynik
 * ich sumowania w postaci "a + b + c + ... + N = wynik". Do wczytywania danych
 * napisz odpowiedni� metod� rekurencyjn�.
 *
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
	public static final String EXIT = "exit";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> numbers = new LinkedList<>();
		readData(sc, numbers);
		printData(numbers);	
	}

	// metoda rekurencyjna do wczytywania danych
	static void readData(Scanner sc, List<Double> list) {
		System.out.println("Podaj kolejn� liczb�");
		String inputNumber = sc.nextLine();
		if (inputNumber.equals(EXIT)) {
			return;// natychmiastowe wyjscie z programu gdypolecenie EXIT
		}
		try {
			Double num = Double.parseDouble(inputNumber);
			list.add(num);
		} catch (NumberFormatException e) {
			System.out.println("Niepoprawny format danych");
		}
		readData(sc, list);
	}
	
	static void printData(List<Double> list) {
		StringBuilder sb = new StringBuilder();
		double sum = 0;
		for (Double p : list) {
			sb.append(p);
			sb.append('+');
			sum = sum+p;
		}
		sb.replace(sb.length()-1, sb.length(), "=");
		sb.append(sum);
		System.out.println(sb);
		
		
	}
}
