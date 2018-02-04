package theory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		
		Set<Person> persons = new HashSet<Person>();
		persons.add(new Person("Monika", "Szkudlarek"));
		persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Szymon", "Zalewski"));
        
        System.out.println(persons.size());
        persons.remove(new Person("Monika", "Szkudlarek"));
        System.out.println(persons.contains(new Person("Monika", "Szkudlarek")));
        System.out.println(persons.size());

	}
}
