package hospital.management;

public class Hospital {
	private static final int MAX_EMPLOYESS = 3;

	private Person[] person;
	private int employeeNumber;

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setPerson(Person[] person) {
		this.person = person;
	}

	public Person[] getPerson() {
		return person;
	}

	public Hospital() {
		person = new Person[MAX_EMPLOYESS];
		setEmployeeNumber(0);
	}

	public void addPerson(Person person) {
		if (employeeNumber < MAX_EMPLOYESS) {
			getPerson()[employeeNumber] = person;
			setEmployeeNumber(getEmployeeNumber() + 1);
		}
	}

	@Override
	public String toString() {
		String description = "";
		for (int i = 0; i < person.length; i++) {
			description = description + person[i] + "\n";
		}
		return description;

	}

}
