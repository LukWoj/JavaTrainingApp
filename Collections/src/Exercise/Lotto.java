package Exercise;
/**
 * Napisz program, kt�ry b�dzie symulowa� program typu "totolotek". Napisz klas�
 * Lotto, kt�ra przechowuje list�. Powinna posiada� metody:
 * generate() - wygeneruje do listy liczby od 1 do 49
 *  randomize() - wymiesza elementy na li�cie (pierwsze sze�� liczb na li�cie to wynik losowania)
 * checkResult(List<Integer> numbers) - sprawdza ile liczb z listy podanej jako
 * argument pokrywa si� z pierwszymi sze�cioma elementami "losowania"
 * Wczytaj od u�ytkownika sze�� liczb i przetestuj dzia�anie aplikacji.
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	List<Integer> lottoNumbers;

	public Lotto() {
		lottoNumbers = new ArrayList<>();
		generate();
	}

	// generuje liczby totolotka
	public void generate() {
		for (int i = 1; i <= 49; i++) {
			lottoNumbers.add(i);
		}
	}

	// miesza elementy totolotka
	private void randomize() {
		Collections.shuffle(lottoNumbers);
	}

	public int checkResult(List<Integer> userNumbers) {
		int found = 0;
		List<Integer> lottoResult = userNumbers.subList(0, 6);// pierwsze sze��
																// liczb to
																// wynik totka
		System.out.println("Wyniki totolotka: ");

		for (Integer lr : lottoResult) {// drukowanie wynik�w du�ego lotka
			System.out.println(lr + " ");
		}

		for (int i = 0; i < 6; i++) {
			if (lottoResult.contains(userNumbers.get(i))) {
				found++;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		List<Integer> lottoUserNumbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wytypuj liczby du�ego lotka podaj�c kolejna liczbe");
		for (int i = 0; i < 6; i++) {
			System.out.println("Podaj kolejn� liczb�");
			lottoUserNumbers.add(sc.nextInt());
			sc.nextLine();

			Lotto lotto = new Lotto();
			lotto.randomize();
			int found = lotto.checkResult(lottoUserNumbers);
			System.out.println("Trafione liczby: " + found);

		}
	}

}
