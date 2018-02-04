public class NotebookShop {
	public static void main(String[] args) {
		DataStore dataStore = new DataStore();
		dataStore.addComputer(new Computer("ASUS", 12345));
		dataStore.addComputer(new Computer("ASUS", 12345));
		dataStore.addComputer(new Computer("APPLE", 5));
		dataStore.addComputer(new Computer("APPLE", 6));
		dataStore.addComputer(new Computer("HP", 8871927));

		Computer compToFind = new Computer("ASUS", 12345);
		int computersFound = dataStore.findSameComputer(compToFind);
		System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);

		System.out.println("Wszystkie dostêpne komputery: ");
		for (Computer c : dataStore.getComputers()) {
			System.out.println(c);
		}
	}
}
