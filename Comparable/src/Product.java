import java.util.Arrays;
import java.util.Comparator;
/**
 * Sortowanie:
 * 1) comparable comparator w klasie zagnie¿d¿onej
 *
 */
public class Product implements Comparable<Product> {

	private String producer;
	private String name;
	private String category;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product(String producer, String name, String category) {
		setProducer(producer);
		setCategory(category);
		setName(name);
	}

	@Override
	public String toString() {
		return "Product [category = " + category + ", producer = " + producer + ", name = " + name + " ]";
	}

	@Override
	public int compareTo(Product p) {
		int categoryCompare = this.category.compareTo(p.getCategory());
		if (categoryCompare != 0) {
			return categoryCompare;
		}

		int producerCompare = this.producer.compareTo(p.getProducer());

		if (producerCompare != 0) {
			return producerCompare;
		}
		return this.name.compareTo(p.getName());
	}
	
	//klasa zagnie¿d¿ona
	public static class productNameComparator implements Comparator<Product> {

		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	
}