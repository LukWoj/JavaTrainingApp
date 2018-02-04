package hospital.management;

public class Nurse extends Person {
	private double overtime;

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}

	public Nurse(String name, String surmane, double salary, double overtime) {
		super(name, surmane, salary);
		setOvertime(overtime);
	}
}
