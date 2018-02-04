/**
 * Napisz program, który pozwoli zsumowaæ dowoln¹ iloœæ liczb od u¿ytkownika.
 * Aplikacja powinna przestaæ wczytywanie liczb, gdy u¿ytkownik wprowadzi
 * polecenie "exit". Po wczytaniu liczb wyœwietl je na ekranie oraz podaj wynik
 * ich sumowania w postaci "a + b + c + ... + N = wynik". Do wczytywania danych
 * napisz odpowiedni¹ metodê rekurencyjn¹.
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
		System.out.println("Podaj kolejn¹ liczbê");
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
