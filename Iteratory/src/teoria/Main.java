package teoria;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(1);
		set.add(5);
		set.add(3);
		/*
		 * for (Integer integer : set) { System.out.println(integer); }
		 */

		Iterator<Integer> setIterator = set.iterator();
		while (setIterator.hasNext()) {
			int number = setIterator.next();
			System.out.print(number + " ");
		}

		Iterator<Integer> setIterator2 = set.iterator();

		while (setIterator2.hasNext()) {
			int num = setIterator2.next();
			if (num == 1) {
				setIterator2.remove();
			}
		}
		System.out.println();

		Iterator<Integer> setIterator3 = set.iterator();
		while (setIterator3.hasNext()) {
			int number = setIterator3.next();
			System.out.print(number + " ");
		}
	}
}
