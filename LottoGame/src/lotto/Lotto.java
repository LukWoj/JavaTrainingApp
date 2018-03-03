package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static List<Integer> lotto;

	public Lotto() {
		lotto = new ArrayList<>();
		lotto = generateLotto();
	}

	public List<Integer> generateLotto() {
		List<Integer> lotto = new ArrayList<>();
		Random rand = new Random();
		int randomNumber = 0;
		for (int i = 0; i < 48; i++) {
			randomNumber = 1 + rand.nextInt(49);
			lotto.add(randomNumber);

		}
		return lotto;

	}

	public int checkResult(List<Integer> userLotto) {
		List<Integer> winners = lotto.subList(0, 6);
		int point = 0;
		for (int i = 0; i < userLotto.size(); i++) {
			int flag = userLotto.get(i);
			if (winners.contains(flag)) {
				point++;
			}
		}
		System.out.println("Lotto Numbers: " + winners + " ");
		return point;
	}
}

