package data;

public class Book extends Publication {
	// Pola
	private String author;
	private int pages;
	private String isbn;

	// settery i gettery
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// Konstruktory
	public Book(String title, String author, int year, int pages, String publisher, String isbn) {
		super(year, title, publisher);
		this.setAuthor(author);
		this.setPages(pages);
		this.setIsbn(isbn);
	}

	@Override
	public String toString() {
		StringBuilder desc = new StringBuilder();
		desc.append(getTitle());
		desc.append("; ");
        desc.append(getAuthor());
        desc.append("; ");
        desc.append(getYear());
        desc.append("; ");
        desc.append(getPages());
        desc.append("; ");
        desc.append(getPublisher());
        desc.append("; ");
        desc.append(getIsbn());
		return desc.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + pages;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}
}