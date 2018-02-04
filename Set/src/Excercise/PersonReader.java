
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
 * W za��czonym pliku namespl.txt znajduje si� lista imiona, ka�de w nowej
 * linii. Problem w tym, �e imiona si� powtarzaj�, a my w programie b�dziemy
 * potrzebowali jedynie unikalnej listy dost�pnych imion. Dodatkowo
 * chcieliby�my, aby imiona by�y automatycznie posortowane w kolejno�ci
 * odwrotnej ni� alfabetyczna. Po wybraniu odpowiedniego zbioru danych wy�wietl
 * na ekranie ilo�� imion w zbiorze, a tak�e pierwszy i ostatni element.
 * Podpowied�: wykorzystaj konstruktor odpowiedniego zbioru, kt�ry jako parametr
 * przyjmuje obiekt komparatora. Wykorzystaj anonimow� klas� wewn�trzn� lub
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
