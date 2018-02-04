public class TshirtShop {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt();
        tshirt1.setSize(Size.SMALL);
        for (Size s : Size.values()) {
            System.out.println(s.getDescription());
        }
        //System.out.println("Wybrałeś koszulke w rozmiarze: " + tshirt1.getSize().getDescription());
        System.out.println("Wybierz rozmiar koszulki");
        tshirt1.setSize(Size.valueOf("LARGE"));//enum na podstawie Stringa
        System.out.println("Wybraleś rozmiar " + tshirt1.getSize().getDescription());

        Tshirt tshirt2 = new Tshirt();
        System.out.println("Wybierz rozmiar koszulki");
        Size tshirtSizeDesc = sizeFromDesc("Mały");
        tshirt2.setSize(tshirtSizeDesc);
        System.out.println("Wybrałeś rozmiar: " + tshirt2.getSize().getDescription());
    }

    private static Size sizeFromDesc(String desc) {
        for (Size s : Size.values()) {//values() zwraca wszystkie mozliwe wartości
            if (s.getDescription().equals(desc)) return s;
        }
        return Size.MEDIUM;// jesli nie znajdzie rozmiaru powiazanego z desc to zwróci domyslny MEDIUM
    }
}


