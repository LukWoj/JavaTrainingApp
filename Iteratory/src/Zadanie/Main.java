package Zadanie;

import java.util.*;

/**
 * Napisz prosty program, w kt�rym do mapy przypiszesz pi�� opisowych warto�ci w
 * postaci obiekt�w typu String, kt�re przechowywa� b�d� informacje w formie
 * "Imi� Nazwisko - Wiek". Kluczami powinny by� nazwiska tych os�b. Za pomoc�
 * iteratora i p�tli while wy�wietl wszystkie dost�pne w mapie warto�ci. Powinny
 * by� one posortowane alfabetycznie wed�ug nazwisk. Dane nie musz� by�
 * wczytywane od u�ytkownika, mo�esz je wprowadzi� bezpo�rednio w kodzie, jednak
 * nie mog� by� one dodawane w kolejno�ci alfabetycznej.
 *
 */
public class Main {

	public static void main(String[] args) {

		Map<String, String> persons = new TreeMap<>();
		persons.put("Kowalski", "Jan Kowalski - 35");
        persons.put("Adamiak", "Ania Adamiak - 21");
        persons.put("Zar�ba", "Adam Zar�ba - 17");
        persons.put("Piotrowski", "Karol Piotrowski - 42");
        persons.put("Bobrowska", "Michalina Bobrowska - 15");

		Iterator<String> iteratorMap = persons.values().iterator();
		while (iteratorMap.hasNext()) {
			System.out.println(iteratorMap.next());
		}
	}
}
