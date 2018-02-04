package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {
		List<Integer> userNumbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wytypuj liczby du¿ego lotka podaj¹c kolejna liczbe");

		for (int i = 0; i < 6; i++) {
			System.out.println("Podaj kolejn¹ liczbê");
			userNumbers.add(sc.nextInt());
			sc.nextLine();

		}
		Lotto lotto = new Lotto();
		lotto.randomize();
		int found = lotto.checkResult(userNumbers);
		System.out.println("Trafione liczby: " + found);
	}
}
