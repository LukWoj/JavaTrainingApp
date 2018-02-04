package hospital.management;

public class HospitalApp {

	public static void main(String[] args) {
		Hospital persons = new Hospital();

		persons.addPerson(new Doctor("Maciek", "Kwiatek", 7500, 1300));
		persons.addPerson(new Nurse("Anna", "Dobrowolska", 2200, 6));
		persons.addPerson(new Nurse("Marta", "Petrowska", 2100, 3));

		System.out.println("Hospital employees: ");
		System.out.println(persons);
	}

}