package Zadanie;

import java.util.*;

/**
 * Napisz prosty program, w którym do mapy przypiszesz piêæ opisowych wartoœci w
 * postaci obiektów typu String, które przechowywaæ bêd¹ informacje w formie
 * "Imiê Nazwisko - Wiek". Kluczami powinny byæ nazwiska tych osób. Za pomoc¹
 * iteratora i pêtli while wyœwietl wszystkie dostêpne w mapie wartoœci. Powinny
 * byæ one posortowane alfabetycznie wed³ug nazwisk. Dane nie musz¹ byæ
 * wczytywane od u¿ytkownika, mo¿esz je wprowadziæ bezpoœrednio w kodzie, jednak
 * nie mog¹ byæ one dodawane w kolejnoœci alfabetycznej.
 *
 */
public class Main {

	public static void main(String[] args) {

		Map<String, String> persons = new TreeMap<>();
		persons.put("Kowalski", "Jan Kowalski - 35");
        persons.put("Adamiak", "Ania Adamiak - 21");
        persons.put("Zarêba", "Adam Zarêba - 17");
        persons.put("Piotrowski", "Karol Piotrowski - 42");
        persons.put("Bobrowska", "Michalina Bobrowska - 15");

		Iterator<String> iteratorMap = persons.values().iterator();
		while (iteratorMap.hasNext()) {
			System.out.println(iteratorMap.next());
		}
	}
}
