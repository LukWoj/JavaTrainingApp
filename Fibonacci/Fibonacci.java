public class Fibonacci {
	
	public static int fibIter(int N)
	{
		int poprzedni = 0;
		int nastepny  = 1;
		int wynik = 0;
		if (N<2) return N;
		
		for (int i=2;i<=N;i++) {
		wynik = poprzedni + nastepny;
	    poprzedni = nastepny;
	    nastepny = wynik;
		}
		return wynik;
	}
	
	
	public static void main(String[] args)
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " " + fibIter(i));
		}
		
	}
}

