
import java.util.Scanner;

/**
 * Napisz prost¹ aplikacjê sk³adaj¹c¹ siê z trzech klas:
 * 
 * Employee - przechowuje informacje o pracowniku (imiê, nazwisko, wyp³ata)
 * Company - przechowuje informacje o pracownikach w postaci map CompanyApp -
 * pozwala wczytywaæ dane od u¿ytkownika
 * 
 * Aplikacja powinna posiadaæ 3 opcje:
 * 
 * Dodanie nowego pracownika Wyszukanie informacji o pracowniku na podstawie
 * imienia i nazwiska po czym wyœwietlenie danych pracownika na ekrani (imiê,
 * nazwisko, wyp³ata) Wyjœcie z programu
 *
 */
public class CompanyApp {

	public static final int ADD_EMPLOYEE = 0;
	public static final int GET_EMPLOYEE = 1;
	public static final int EXIT_PROGRAM = 2;

	private Company company;

	CompanyApp() {
		company = new Company();
	}

	public static void printOptions() {
        System.out.println("0 - dodanie pracownika");
        System.out.println("1 - wyszukiwanie pracownika");
        System.out.println("2 - Wyjœcie z programu");
    }
	
	
	public void addEmployee(Scanner sc) {
		Employee employee = new Employee();
		System.out.println("Dodawanie pracownika");
		System.out.println("Podaj imie");
		employee.setFirstName(sc.nextLine());
		System.out.println("Nazwisko: ");
		employee.setLastName(sc.nextLine());
		System.out.println("Pensja: ");
		employee.setSalary(sc.nextDouble());
		sc.nextLine();
		company.addEmployee(employee);
		
	}
	
	 private void findAndPrintEmployee(Scanner sc) {
	        System.out.println("Wyszukiwanie pracownika.");
	        System.out.println("Podaj imiê: ");
	        String firstName = sc.nextLine();
	        System.out.println("Podaj nazwisko: ");
	        String lastName = sc.nextLine();
	 
	        Employee employee = company.getEmployee(firstName, lastName);// klucz jest unikatowy
	        System.out.println(employee);
	    }
	
	public static void main(String[] args) {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		CompanyApp companyApp = new CompanyApp();
		do {
			CompanyApp.printOptions();
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case CompanyApp.EXIT_PROGRAM:
				System.out.println("Koniec programu");
				sc.close();
				break;
			case CompanyApp.ADD_EMPLOYEE:
				companyApp.addEmployee(sc);
				break;
			case GET_EMPLOYEE:
				companyApp.findAndPrintEmployee(sc);
				break;
			}
		} while (option != EXIT_PROGRAM);

	}
}


