import java.io.*;

import java.util.Scanner;

public class CompanyApp {
	public static final String FILE_STORE = "employees.info";
	public static final int READ_FROM_USER = 1;
	public static final int READ_FROM_FILE = 2;

	public static void main(String[] args) {
		CompanyApp ap = new CompanyApp();
		Company compEmployees = new Company();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wprowadzenie dane pracowników - " + READ_FROM_USER);
		System.out.println("Wczytanie danych pracowników - " + READ_FROM_FILE);
		int option = sc.nextInt();

		if (option == READ_FROM_USER) {
            ap.writeData(compEmployees);
        } else if (option == READ_FROM_FILE) {
            ap.readData(compEmployees);
        }
        sc.close();
	}

	private void writeData(Company company) {
		try (Scanner sc = new Scanner(System.in);
				FileOutputStream fos = new FileOutputStream(FILE_STORE);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			for (int i = 0; i < Company.EMPLOYEES; i++) {
				System.out.println("Podaj imie");
				String name = sc.nextLine();
				System.out.println("Podaj nazwisko");
				String surname = sc.nextLine();
				System.out.println("Wysokoœc wyplaty");
				int salary = sc.nextInt();
				sc.nextLine();
				company.add(new Employee(name, surname, salary), i);
			}
			oos.writeObject(company);
		} catch (IOException e) {
			System.out.println("Blad odczytu");
		}
	}

	private void readData(Company company1) {
		try (FileInputStream fis = new FileInputStream(FILE_STORE); ObjectInputStream ois = new ObjectInputStream(fis);)

		{
			company1 = (Company) ois.readObject();
			for (int i = 0; i < Company.EMPLOYEES; i++) {
				System.out.println(company1.getEmployees()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}


