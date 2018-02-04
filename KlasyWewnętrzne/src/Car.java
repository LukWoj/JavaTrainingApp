public class Car {
	private Engine engine;
	private int fuel;

	public Car() {		
		engine = new Engine("Ferrari"); // utworzenie silnika
		System.out.println("Utworzono samochód z silnikiem " + engine.engineType);
	}

	public void go() throws InterruptedException { // symulacja jazdy samochodem
		while (fuel > 0) {
			engine.consumeFuel();
			System.out.println("Pozosta³o " + fuel + " litrów paliwa");
			Thread.sleep(1000);
		}
		System.out.println("Brak paliwa");
	}

	public void refuel(int liters) { // tankowanie paliwa
		fuel = fuel + liters;
	}

	public class Engine {

		private String engineType; // typ silnika 
		private static final int FUEL_CONSUMPTION = 20; // spalanie na 100km

		public Engine(String type) { // Engine konstruktor
			engineType = type;
		}

		public void consumeFuel() { // metoda - spalanie samochodu
			fuel = fuel - FUEL_CONSUMPTION;
		}
	}
}