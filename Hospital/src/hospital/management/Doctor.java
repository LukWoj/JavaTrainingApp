package hospital.management;

public class Doctor extends Person {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Doctor(String name, String surmane, double salary, double bonus) {
		super(name, surmane, salary);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + ", overtime: " + bonus;
	}

}