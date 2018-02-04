public class CarTest {
	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		car.refuel(4000);// dotankuj samochód
		car.go();// jazda samochodzem
	}
}