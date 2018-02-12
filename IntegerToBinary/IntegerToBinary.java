
public class IntegerToBinary
{
	public static String toBinary ( int N) {
	 String s = "";
		for ( int n = N; n > 0; n = n/2 ) 
		s = n%2 + s;
		return s;
	}
}
