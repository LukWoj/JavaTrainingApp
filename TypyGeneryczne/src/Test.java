
public class Test {

	public static void main(String[] args) {
		Pair<String, Integer> pair_1 = new Pair<String, Integer>("Ania", 1982);
		Pair<Double, Double> pairs_2 = new Pair<Double, Double>(20.5, 40.2);
		Test.printPair(pair_1);
		Test.printPair(pairs_2);
	}

	public static <T, V> void printPair(Pair<T, V> pair) {
		System.out.println("<" + pair.getT() + " ; " + pair.getV() + ">");
	}

}
