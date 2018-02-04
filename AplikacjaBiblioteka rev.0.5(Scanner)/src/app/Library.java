package app;

import utils.DataReader;
import data.Book;

public class Library {
	public static void main(String[] args) {
		final String appName = "Biblioteka v0.5";

		Book[] books = new Book[1000];
		DataReader dataReader = new DataReader();

		System.out.println(appName);
		System.out.println("Wprowad� now� ksi��k�:");
		books[0] = dataReader.readAndCreateBook();
		books[1] = dataReader.readAndCreateBook();
		dataReader.close();

		books[0].printInfo();
		books[1].printInfo();
		System.out.println("System mo�e przechowywa� do " + books.length + " ksi��ek");
	}
}