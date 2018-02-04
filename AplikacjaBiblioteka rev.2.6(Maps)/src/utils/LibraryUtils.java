package utils;

import java.util.Collection;

import data.Book;
import data.Library;
import data.LibraryUser;
import data.Magazine;
import data.Publication;

public class LibraryUtils {

	// ZMIENIONY TYP i PÊTLA
	public static void printBooks(Library lib) {
		Collection<Publication> publications = lib.getPublications().values();
		int countBooks = 0;
		for (Publication p : publications) {
			if (p instanceof Book) {
				System.out.println(p);
				countBooks++;
			}
		}

		if (countBooks == 0) {
			System.out.println("Brak ksi¹¿ek w bibliotece");
		}
	}

	// ZMIENIONY TYP i PÊTLA
	public static void printMagazines(Library lib) {
		Collection<Publication> publications = lib.getPublications().values();
		int countMagazines = 0;
		for (Publication p : publications) {
			if (p instanceof Magazine) {
				System.out.println(p);
				countMagazines++;
			}
		}

		if (countMagazines == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}

	}

	public static void printUsers(Library lib) {
		Collection<LibraryUser> users = lib.getUsers().values();
		for (LibraryUser u : users) {
			System.out.println(u);
		}
	}

}
