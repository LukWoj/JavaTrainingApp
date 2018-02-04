package hospital.management;

public class Person {
	private String name;
	private String surmane;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurmane() {
		return surmane;
	}

	public void setSurmane(String surmane) {
		this.surmane = surmane;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public Person(String name, String surmane, double salary) {
		super();
		setName(name);
		setSurmane(surmane);
		setSalary(salary);
	}

	
	@Override
	public String toString() {
		return "Name: " + name + ", Surmane: " + surmane + ", salary: " + salary + "";
	}

}
