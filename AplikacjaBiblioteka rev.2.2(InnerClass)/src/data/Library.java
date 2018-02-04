package data;

import data.Book;
import data.Magazine;

public class Library {

	public static final int MAX_PUBLICATIONS = 2000;
	private Publication[] publications;
	private int publicationNumber;// index of publication number in the table of
									// publications

	public int getPublicationsNumber() {
		return publicationNumber;
	}

	public void setPublicationsNumber(int publicationsNumber) {
		this.publicationNumber = publicationsNumber;
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

	public void addPublication(Publication publication) throws ArrayIndexOutOfBoundsException {
		if (publicationNumber == MAX_PUBLICATIONS) {
			throw new ArrayIndexOutOfBoundsException(
					"The maximum possible number of publications is: " + MAX_PUBLICATIONS);
		}
		getPublications()[publicationNumber] = publication;
		setPublicationsNumber(getPublicationsNumber() + 1);
	}

	@Override
	public String toString() { // All publications printing
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < publicationNumber; i++) {
			builder.append(publications[i]);
			builder.append("\n");
		}
		return builder.toString();
	}
}
