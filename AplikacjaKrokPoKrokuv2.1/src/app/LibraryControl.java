package app;
  
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
  
 
import utils.DataReader;
import utils.LibraryUtils;
import data.Book;
import data.Library;
import data.Magazine;
  
public class LibraryControl {
    // zmienna do komunikacji z u¿ytkownikiem
    private DataReader dataReader;
  
    // "biblioteka" przechowuj¹ca dane
    private Library library;
  
    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }
    /*
     * G³ówna pêtla programu, która pozwala na wybór opcji i interakcjê
     */
    public void controlLoop() {
        Option option = null;
        while (option != Option.EXIT) {
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());
                switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    ;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
            }
        }
        // zamykamy strumieñ wejœcia
        dataReader.close();
    }
  
    private void printOptions() {
        System.out.println("Wybierz opcjê: ");
        for (Option o : Option.values()) {
            System.out.println(o);
        }
    }
  
    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
  
    private void printBooks() {
        LibraryUtils.printBooks(library);
    }
  
    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }
  
    private void printMagazines() {
        LibraryUtils.printMagazines(library);
    }
}