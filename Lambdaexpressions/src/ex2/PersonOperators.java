package ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonOperators {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Jan", "Kowalski", 42));
		persons.add(new Person("Kasia", "Kruczkowska", 22));
		persons.add(new Person("Piotr", "Adamiak", 15));
		persons.add(new Person("Krzysztof", "Wojtyniak", 16));
		persons.add(new Person("Agnieszka", "Zagumna", 18));
		persons.add(new Person("Basia", "Cyniczna", 28));

		consumeList(persons, p -> System.out.println(p));
		applyToList(persons, p -> {
			p.setAge(p.getAge() + 1);
			return p;
		});
		System.out.println(">>>");
		consumeList(persons, p -> System.out.println(p));
		filterByPredicate(persons, p -> p.getAge() > 18);
	}

	private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}

	private static <T> void applyToList(List<T> list, Function<T, T> fn) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, fn.apply(list.get(i)));
		}
	}

	private static <T> void filterByPredicate(List<T> list, Predicate<T> pre) {
		for (T t : list) {
			if (pre.test(t)) {
				System.out.println(t);
			}
		}
	}

}
