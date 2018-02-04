package data;

import data.Book;
import data.Magazine;

public class Library {

	public static final int MAX_PUBLICATIONS = 2000;
	private Publication[] publications;

	private int publicationsNumber;

	public int getPublicationsNumber() {
		return publicationsNumber;
	}

	public void setPublicationsNumber(int publicationsNumber) {
		this.publicationsNumber = publicationsNumber;
	}

	public Publication[] getPublications() {
		return publications;
	}

	public void setPublications(Publication[] publications) {
		this.publications = publications;
	}

	public Library() {
		setPublications(new Publication[MAX_PUBLICATIONS]);
	}

	public void addMagazine(Magazine magazine) {
		addMagazine(magazine);
	}

	public void addBook(Book book) {
		addPublication(book);
	}

	public void addPublication(Publication publication) {
		if (publicationsNumber < MAX_PUBLICATIONS) {
			getPublications()[publicationsNumber] = publication;
			setPublicationsNumber(getPublicationsNumber() + 1);
		} else {
			System.out.println("Osi¹gn¹les maksymalna liczbe publikacji");
		}
	}

	public void printBooks() {
		int bookIter = 0;
		for (int i = 0; i < getPublicationsNumber(); i++) {
			if (publications[i] instanceof Book) {
				System.out.println(publications[i]);
				bookIter++;
			}
		}
		if(bookIter == 0) {
            System.out.println("Brak ksi¹¿ek w bibliotece");
        }
	}

	public void printMagazines() {
		int magazinesIter = 0;
		for (int i = 0; i < getPublicationsNumber(); i++) {
			if (publications[i] instanceof Magazine) {
				System.out.println(publications[i]);
				magazinesIter++;
			}
		}
		if(magazinesIter == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
	}
}