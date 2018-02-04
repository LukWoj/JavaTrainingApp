package logic;
/*Modyfikatory protected i default 
(domyœlny, czyli brak specyfikatora) maj¹ niemal
identyczne dzia³anie i ograniczaj¹ dostêp do sk³adowej
klasy do danego pakietu. Dodatkowo s³owo protected
nie mo¿e byæ stosowane do oznaczenia 
klasy a jedynie sk³adowych klasy (pola, metody konstruktory).



Pakiety pozwalaj¹ na wygodn¹ organizacjê klas. Za pomoc¹ s³owa 
package wskazujemy w jakim pakiecie znajduje siê klasa, a za
pomoc¹ s³owa import wskazujemy klasê z 
jakiego pakietu bêdziemy wykorzystywali.
public mówi o tym, ¿e klasa lub sk³adowa klasy mo¿e byæ 
dostêpna z innych pakietów
protected i default ograniczaj¹ dostêp do klasy lub zmiennych
klasy do danego pakietu.
private ogranicza dostêp do sk³adowych klasy tylko do tej
konkretnej klasy
s³owa protected i private nie mog¹ 

byæ stosowane w w stosunku do klas (chyba, ¿e bêd¹ to klasy wewnêtrzne)*/

public class Car {
	protected int year;
    protected String brand;
    protected String model;
    protected String color;
 
    protected Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }
 
    protected Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
}