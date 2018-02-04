
public class TshirtShop{
    public static void main(String[] args) {

        System.out.println("Value Of SMALL : "+ SIZE.valueOf("SMALL") );
        System.out.println("Value Of LARGE : "+ SIZE.valueOf("LARGE") );
        System.out.println("Value Of MEDIUM : "+ SIZE.valueOf("MEDIUM") );
        System.out.println("Value Of EXTRA LARGE : "+ SIZE.valueOf("XLARGE") );

        System.out.println( SIZE.getSize(36));
    }
}

