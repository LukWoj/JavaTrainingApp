public class Employee extends Person {

	private static final long serialVersionUID = -8001540488581367087L;

	private double salary;

	public Employee(String name, String surname) {
		super(name, surname);

	}

	public Employee(String name, String surname, double salary) {
		super(name, surname);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", wyplata: " + salary;
	}

}
