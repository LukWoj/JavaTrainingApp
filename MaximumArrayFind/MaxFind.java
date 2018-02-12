
public class MaxFind
{
	public int maxArray(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if ( a[i] > max ) max = a[i];
		}
		return max;
		
	}
}
