
package Excercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * W za³¹czonym pliku namespl.txt znajduje siê lista imiona, ka¿de w nowej
 * linii. Problem w tym, ¿e imiona siê powtarzaj¹, a my w programie bêdziemy
 * potrzebowali jedynie unikalnej listy dostêpnych imion. Dodatkowo
 * chcielibyœmy, aby imiona by³y automatycznie posortowane w kolejnoœci
 * odwrotnej ni¿ alfabetyczna. Po wybraniu odpowiedniego zbioru danych wyœwietl
 * na ekranie iloœæ imion w zbiorze, a tak¿e pierwszy i ostatni element.
 * PodpowiedŸ: wykorzystaj konstruktor odpowiedniego zbioru, który jako parametr
 * przyjmuje obiekt komparatora. Wykorzystaj anonimow¹ klasê wewnêtrzn¹ lub
 * klasy
 */

public class PersonReader {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        
		
		TreeSet<String> namesDatabase = new TreeSet<>( new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		
		String name;
        while ((name = reader.readLine()) != null) {
            namesDatabase.add(name);
        }
        reader.close();
        
        System.out.println(namesDatabase.size());
        System.out.println(namesDatabase.first());
        System.out.println(namesDatabase.last());
		
	}
}
