package utils;

import java.util.Arrays;

import data.Book;
import data.Library;
import data.Library.AlpabeticComparator;
import data.Magazine;
import data.Publication;

public class LibraryUtils {
	
	public static void printBooks(Library lib) {
		int bookIter = 0;
		Publication[] publications = lib.getPublications();
		Arrays.sort(publications, new Library.AlpabeticComparator());
		int publicationsNumber = lib.getPublicationsNumber();
		for (int i = 0; i < publicationsNumber; i++) {
			if (publications[i] instanceof Book) {
				System.out.println(publications[i]);
				bookIter++;
			}
		}
		if (bookIter == 0) {
			System.out.println("Brak ksi¹¿ek w bibliotece");
		}
	}
	
	public static void printMagazines(Library lib) {
		int magazinesIter = 0;
		Publication[] publications = lib.getPublications();
		Arrays.sort(publications, new Library.AlpabeticComparator());
		int publicationsNumber = lib.getPublicationsNumber();
		for (int i = 0; i < publicationsNumber; i++) {
			if (publications[i] instanceof Magazine) {
				System.out.println(publications[i]);
				magazinesIter++;
			}
		}
		if (magazinesIter == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}
	}
}
