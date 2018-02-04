package utils;

import java.util.Scanner;

import data.Book;
import data.Magazine;

public class DataReader {
	private Scanner sc;

	public DataReader() {
		sc = new Scanner(System.in);
	}

	public void close() {
		sc.close();
	}

	public int getInt() {
		int number = sc.nextInt();
		sc.nextLine();
		return number;
	}

	public Book readAndCreateBook() {
		System.out.println("Tytu³: ");
		String title = sc.nextLine();
		System.out.println("Autor: ");
		String author = sc.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = sc.nextLine();
		System.out.println("ISBN: ");
		String isbn = sc.nextLine();
		System.out.println("Rok wydania: ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Iloœæ stron: ");
		int pages = sc.nextInt();
		sc.nextLine();

		return new Book(title, author, year, pages, publisher, isbn);
	}

	public Magazine readAndCreateMagazine() {
		System.out.println("Tytu³: ");
		String title = sc.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = sc.nextLine();
		System.out.println("Jêzyk: ");
		String language = sc.nextLine();
		System.out.println("Rok wydania: ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Miesi¹c: ");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.println("Dzieñ: ");
		int day = sc.nextInt();
		sc.nextLine();

		return new Magazine(title, publisher, language, year, month, day);
	}
}