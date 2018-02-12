
public class Main
{
	
	public static void main(String[] args)
	{
		int N = 20;
		int[] tab = new int[N];
		for ( int i=0; i < tab.length; i++ ) {
			tab[i] = i;
		}
		
		MaxFind maxValue = new MaxFind();
		int m = maxValue.maxArray(tab);
		System.out.println(m);
	}

}
