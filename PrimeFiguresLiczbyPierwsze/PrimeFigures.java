
public class PrimeFigures
{
	/*public static boolean isPrime(int prime)
	{
		if (prime < 2) return false;
		
		for ( int i = 2; i < Math.sqrt(prime); i++) {
			if ( prime%i == 0) return false;
		} else {
		return true;
		}*/
	
	public static boolean isPrime(int N)
	{
	if (N < 2) return false;// 1 i 2 nie jest liczbą pierwszą
	for (int i = 2; i * i <= N; i++)
	if (N % i == 0) return false;
	return true;
	}
}
