import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {

	public static void main(String[] args) {
		Product[] products = new Product[7];
		products[0] = new Product("Knorr", "Zupa grochowa", "Zupy");
		products[1] = new Product("Knorr", "Zupa ogórkowa", "Zupy");
		products[2] = new Product("Vifon", "Zupa krewetkowa", "Zupy");
		products[3] = new Product("Vifon", "Zupa PHO", "Zupy b³yskawiczne");
		products[4] = new Product("Vifon", "Rosó³", "Zupy");
		products[5] = new Product("Pudliszki", "Pulpety w sosie pomidorowym", "Dania obiadowe");
		products[6] = new Product("Pudliszki", "Racuchy", "Dania obiadowe");
		
		System.out.println("Baza nieposortowana");
		for (Product product : products) {
			System.out.println(product);
		}
		
		System.out.println("Baza posortowana");
		Arrays.sort(products);
		
		for (Product product : products) {
			System.out.println(product);	
		}
		System.out.println();
		System.out.println("Sortowanie comparator - nazwa produktu");
		Arrays.sort(products, new Product.productNameComparator());
		for (Product product : products) {
			System.out.println(product);
		}
		//klasa anonimowa
		Arrays.sort(products, new Comparator<Product>() {
		    @Override
		    public int compare(Product o1, Product o2) {
		        return o1.getProducer().compareTo(o2.getProducer());
		    }
		});
		System.out.println();
		System.out.println("Sortowanie klasa anonimowa");
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
