package test1;

import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

/**
 *  @author �ukasz - archyzone
 * W niekt�rych przypadkach czas poszukiwania mo�emy znacz�co zmniejszy�. Dzieje
 * si� tak na przyk�ad, gdy przeszukiwany zbi�r przechowujemy w rosn�co
 * uporz�dkowanej tablicy. W takim przypadku wystarczy jedynie O(\log n)
 * operacji, by odnale�� poszukiwany element lub stwierdzi� jego brak. Algorytm
 * utrzymuje zakres [l,\ldots,r], w kt�rym mo�e znajdowa� si� element; przy
 * ka�dym por�wnaniu zakres zostaje zmniejszony o po�ow�.
 */

public class BinarySearch
{

	/**
	 * @param a
	 * the array of integers, must be sorted in ascending order lo =
	 * 0; mid = low + (high - low) / 2 low = mid + 1
	 */
	public static int indexOf(int[] a, int key)
	{

		int findNumber = key;

		int lo = 0;
		int hi = a.length - 1; // int mid = lo + (hi - lo) / 2; or (lo + hi)/2;

		while (lo <= hi)
		{

			int mid = lo + (hi - lo) / 2; // ; or (lo + hi)/2;

			if (a[mid] == findNumber)
			{
				return a[mid];
			} else if (a[mid] < findNumber)
			{
				lo = mid + 1;
			} else
				hi = mid - 1;
		}
		return -1;

	}

	public static void main(String[] args)
	{

		int[] array = { 2, 67, 6, 6, 8, 34, 4 };
		// sort the array
		Arrays.sort(array);

		for (int p : array)
		{
			System.out.print(p + " ");
		}
		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj element do wyszukania");
		int userKey = in.nextInt();
		in.close();
		int result = indexOf(array, userKey);
		if (result == -1)
		{
			System.out.println("There is no number in array");
		} else
		{
			System.out.println("There is number in the array");
		}

	}
}
