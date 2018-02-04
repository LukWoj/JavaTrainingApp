import java.util.Scanner;

public class HospitalApp {
	public static final int EXIT = 0;
	public static final int ADD_PATIENT = 1;
	public static final int PRINT_PATIENTS = 2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option = -1;

		Hospital hospital = new Hospital();

		while (option != EXIT) {
			System.out.println("Dostêpne opcje: ");
            System.out.println("0 - wyjœcie z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyœwietlenie listy pacjentów");
 
            System.out.println("Wybierz opcjê: ");
            option = input.nextInt();
            input.nextLine();
			switch (option) {
			case ADD_PATIENT:
				 Patient patient = new Patient();
	                System.out.println("Imiê: ");
	                patient.setFirstName(input.nextLine());
	                System.out.println("Nazwisko: ");
	                patient.setLastName(input.nextLine());
	                System.out.println("PESEL: ");
	                patient.setPesel(input.nextLine());
	                hospital.addPatients(patient);
	                break;
			case PRINT_PATIENTS:
				hospital.printPatiens();
                break;
            case EXIT:
                System.out.println("Zamykam program!");
                break;
            default:
                System.out.println("Nie znaleziono takiej opcji");
            }
        }
         
        input.close();
    }
}

