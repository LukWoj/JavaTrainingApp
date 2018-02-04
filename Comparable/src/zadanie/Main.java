package zadanie;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Napisz program, w którym utworzysz tablicê 20 dowolnych liczb ca³kowitych, a
 * nastêpnie posortujesz tablicê w porz¹dku rosn¹cym i malej¹cym, za ka¿dym
 * razem wyœwietlaj¹c wynik posortowania na ekranie. Wykorzystaj interfejs
 * Comparator i anonimowe klasy wewnêtrzne.
 *
 */
class Main {

	public static void main(String[] args) {
	Integer[] tab	= {1, 5, 10, 19, 102, 43, 25, 36, 31,99, 9, 77, 7, 66, 6, 55, 44, 33, 1098, 1111};
		System.out.println("Tablica nieposortowana");
		Arrays.sort(tab);
		for (int i : tab) {
			System.out.println(i);
		}
		
		//klasa anonimowa
		Arrays.sort(tab, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1.compareTo(o2));
			}
		});
		
		System.out.println("Posortowana malej¹co: ");
        System.out.println(Arrays.toString(tab));
		
		
	}
}
