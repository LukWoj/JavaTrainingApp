public class DataStore {

	public static final int MAX_COMPUTERS = 100;
	private Computer[] notebooks;
	private int computersNumber;

	public Computer[] getComputers() {
		Computer[] comps = new Computer[computersNumber];
		for (int i = 0; i < computersNumber; i++) {
			comps[i] = notebooks[i];
		}
		return comps;
	}

	public void setComputersNumber(int computersNumber) {
		this.computersNumber = computersNumber;
	}

	public int getComputersNumber() {
		return computersNumber;
	}

	public DataStore() {
		notebooks = new Computer[MAX_COMPUTERS];
		computersNumber = 0;
	}

	private void setComputers() {
		// TODO Auto-generated method stub

	}

	public void addComputer(Computer computer) {
		if (computersNumber < MAX_COMPUTERS) {
			notebooks[computersNumber] = computer;
			computersNumber++;
		}
	}

	public int findSameComputer(Computer compToFind) {
		int count = 0;
		if (compToFind == null) {
			return 0;
		}
		for (int i = 0; i < computersNumber; i++) {
			if (compToFind.equals(notebooks[i])) {
				count++;
			}
		}
		return count;
	}
}
