import java.util.Arrays;

public class PersonDatabase {
	private final int INITIAL_CAPACITY = 1;
	private Person[] persons;
	private int emptyPlace;

	public PersonDatabase() {
		persons = new Person[INITIAL_CAPACITY];
		emptyPlace = 0;
	}

	public void add(Person p) {
		if (emptyPlace == persons.length) {
			persons = Arrays.copyOf(persons, persons.length * 2);
		}
		persons[emptyPlace] = p;
		emptyPlace++;
	}

	public void remove(Person p) {
		if (p == null)
			return;

		final int NOT_FOUND = -1;
		int found = NOT_FOUND;
		int i = 0;
		while (i < persons.length && found == NOT_FOUND) {
			if (p.equals(persons[i])) {
				found = i;
			} else {
				i++;
			}
		}

		if (found != NOT_FOUND) {
			System.arraycopy(persons, found + 1, persons, found, persons.length - found - 1);
			emptyPlace--;
		}
	}

	public Person get(int index) throws ArrayIndexOutOfBoundsException {
		if (index >= emptyPlace || index < 0) {
			throw new ArrayIndexOutOfBoundsException("B³êdny parametr");
		}
		return persons[index];
	}

	public int size() {
		return emptyPlace;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PersonsDatabase size: " + size());
		sb.append("\n");
		for (int i = 0; i < emptyPlace; i++) {
			sb.append(persons[i].toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
