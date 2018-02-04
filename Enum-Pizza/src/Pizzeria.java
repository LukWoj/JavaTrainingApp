import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze:");

        for(Pizza p: Pizza.values()) {// wyswietlanie wszystich konfiguracji pizz
            System.out.println(p);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Jaką pizzę wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine());
        // valueof()
        // jako argument przyjmuje napis, a w wyniku zwraca wartość
        // typu enum zgodną z tym napisem. Przez zgodność
        // należy rozumieć napis identyczny z nazwą wartości:

        System.out.println("Dziękujemy za zamówienie pizzy " + pizza.name());
        input.close();
    }
}