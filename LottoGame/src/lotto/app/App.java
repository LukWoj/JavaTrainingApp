package lotto.app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import lotto.Lotto;

public class App {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		List<Integer> userLotto = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int check = 6;
		System.out.println("Type 6 digits from 1-49");

		boolean flag = true;
		while (flag) {
			System.out.println("Type next number");
			try {
				int number = sc.nextInt();
				sc.nextLine();
				if (number > 0 && number < 50) {
					userLotto.add(number);
					check--;
					if (check == 1) {
						flag = true;
					}
				} else {
					System.out.println("Try again");
				}
			} catch (InputMismatchException e) {
				System.out.println("You have put wrong number");
				sc.nextLine();
			}

		}
		System.out.println("Number of hits: " + lotto.checkResult(userLotto));
	}
}
