
public class ArraySorter {
	Sortable sorter = new Sortable() {

		@Override
		public void bubblesort(int[] tab) {
			boolean isSorted = false;
			while (!isSorted) {
				isSorted = true;
				for (int i = 0; i < tab.length - 1; i++) {
					if (tab[i] > tab[i + 1]) {
						swap(tab, i, i + 1);
						isSorted = false;
					}
				}
			}

		}
	};

	public static void swap(int[] tab, int i, int j) {
		int temp = tab[i];
		tab[i] = tab[j];
		tab[j] = temp;
	}

	public static void main(String[] args) {

		int[] tab = { 9, 3, 5, 6, 9 };

		ArraySorter a = new ArraySorter();
		a.sorter.bubblesort(tab);

		for (int i : tab) {
			System.out.print(i);
		}
	}
}
