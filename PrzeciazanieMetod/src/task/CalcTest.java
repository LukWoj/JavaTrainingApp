package task;

/**
 * Napisz program-kalkulator, który bêdzie sk³ada³ siê z dwóch klas: Calculator
 * CalcTest W klasie Calculator zdefiniuj metody add i subtract w kilku
 * przeci¹¿onych wersjach, aby mog³y dodawaæ lub odejmowaæ 2 lub 3 liczby (a+b+c
 * lub a-b-c) wybranego przez Ciebie typu liczbowego. W klasie CalcTest
 * przetestuj dzia³anie klasy Calculator.
 *
 */
public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 30;
        double b = 20;
        double c = 10;

        System.out.println("A: " + a + ", B: " + b + ", C: " + c);

        System.out.println("A+B = " + calc.add(a, b));
        System.out.println("A+B+C = " + calc.add(a, b, c));

        System.out.println("A-B = " + calc.subtract(a, b));
        System.out.println("A-B-C = " + calc.subtract(a, b, c));
    }
}