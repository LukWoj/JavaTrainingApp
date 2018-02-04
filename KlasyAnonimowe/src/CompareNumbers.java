public class CompareNumbers {
	
	public static void main(String[] args) {

		BiggestNumber nc = new BiggestNumber() {// klasa anonimowa konczy sie œrednikiem

			@Override
			public int takeBiggest(int[] tab) {
				if (tab == null || tab.length == 0) 
				return 0;
				int biggestNumber = tab[0];
				for (int i = 1; i < tab.length; i++) {
					if(biggestNumber < tab[i]) {
						biggestNumber = tab[i];
					}
				}
				return biggestNumber;
			}
		};
		int[] tab = { 5, 10, -8, -23, 1009, 2938, 153, 24 };
		System.out.println("Najwiêksza z liczb to: " + nc.takeBiggest(tab));
	}
}
