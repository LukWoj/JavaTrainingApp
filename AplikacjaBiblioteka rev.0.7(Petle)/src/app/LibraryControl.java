package app;

import utils.DataReader;
import data.Book;
import data.Library;


public class LibraryControl {
    // opcje programu
    public final int exit = 0;
    public final int addBook = 1;
    public final int printBook = 2;
    private Library library;
    private DataReader dataReader;

    public LibraryControl() {
        library = new Library();
        dataReader = new DataReader();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
    }
    public void controlLoop() {
        printOptions();
        int option;
        while ((option = dataReader.getInt()) != exit) {
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBook:
                    printBooks();
                    break;
                    default:
                    	System.out.println("Nie ma takiej opcji wprowadz ponownie");
            }
            printOptions();
        }
        dataReader.close();
    }
    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
    private void printBooks() {
        library.printBooks();
    }
}

