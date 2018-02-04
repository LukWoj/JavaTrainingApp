package theory;

class Car {
    int year;
    String brand;
    String model;
    String color;
 
    // konstruktor1
    Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }
 
    // konstruktor2
    Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
}