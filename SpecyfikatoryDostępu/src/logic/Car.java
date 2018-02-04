package logic;
/*Modyfikatory protected i default 
(domy�lny, czyli brak specyfikatora) maj� niemal
identyczne dzia�anie i ograniczaj� dost�p do sk�adowej
klasy do danego pakietu. Dodatkowo s�owo protected
nie mo�e by� stosowane do oznaczenia 
klasy a jedynie sk�adowych klasy (pola, metody konstruktory).



Pakiety pozwalaj� na wygodn� organizacj� klas. Za pomoc� s�owa 
package wskazujemy w jakim pakiecie znajduje si� klasa, a za
pomoc� s�owa import wskazujemy klas� z 
jakiego pakietu b�dziemy wykorzystywali.
public m�wi o tym, �e klasa lub sk�adowa klasy mo�e by� 
dost�pna z innych pakiet�w
protected i default ograniczaj� dost�p do klasy lub zmiennych
klasy do danego pakietu.
private ogranicza dost�p do sk�adowych klasy tylko do tej
konkretnej klasy
s�owa protected i private nie mog� 

by� stosowane w w stosunku do klas (chyba, �e b�d� to klasy wewn�trzne)*/

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