public class TshirtApp {
    public static void main(String[] args) {
        Tshirt tShirt1 = new Tshirt();
        tShirt1.setSize(Size.SMALL);
        System.out.println(tShirt1.getSize());
        System.out.println(tShirt1.getSize().getDescription());
        System.out.println("Dostępne rozmiary tshirtów: ");
        for (Size s : Size.values()) {
            System.out.println(s);
        }
        System.out.println("Wybierz rozmiar koszulki: ");
        thirt1.setSize(Size.valueOf("MEDIUM"));
        System.out.println("Wybrałeś tshirt w rozmiarze: " + tshirt.getSize().getDescription());
    }
}

