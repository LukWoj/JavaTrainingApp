package app;

import java.util.NoSuchElementException;

public enum Option {

	EXIT(0, "Wyjœcie z programu"),
	ADD_BOOK(1, "Dodanie ksi¹¿ki"),
	ADD_MAGAZINE(2,"Dodanie magazynu/gazety"),
	PRINT_BOOKS(3,"Wyœwietlenie dostêpnych ksi¹¿ek"),
	PRINT_MAGAZINES(4, "WYœwietlenie dostêpnych magazynów/gazet");

	private int value;
	private String description;

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	Option(int value, String desc) {
		this.value = value;
		this.description = desc;
	}

	@Override
	public String toString() {

		return value + " - " + description;
	}

	public static Option createFromInt(int option) throws NoSuchElementException {
		Option result = null;
		try {
			result = Option.values()[option];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new NoSuchElementException("Element o wskazanym ID nie istnieje");
		}

		return result;// pozwala przekszta³ciæ wartoœæ typu int
						// na odpowiedni¹ wartoœæ typu Option
	}

}
