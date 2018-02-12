import java.util.*;
/**
*Wyszukiwanie liniowe polega na sprawdzaniu
*kolejnych elementów tablicy i porównywaniu ich z szukan¹ wartoœci¹. 
*Liczba porównañ w najgorszym przypadku mo¿e osi¹gn¹æ rozmiar tablicy. 
*Chcemy napisaæ metodê, która w podanej jako parametr tablicy znajdzie 
*okreœlon¹ wartoœæ. 
*W przypadku sukcesu metoda ma zwróciæ indeks znalezionego elementu, 
*a w przypadku nie znalezienia wartoœæ -1.
*Oczywiście w pesymistycznym przypadku (np. gdy zbiór nie zawiera poszukiwanego elementu) koszt czasowy, to O(n). 
*/
public class WyszukiwanieLiniowe {
	
	public static int findLinear(int[] inputArray, int findNumber ) {
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == findNumber) return i;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
	int[] array = {2, 5, 6, 6, 8, 34, 345};	
	
	int result = findLinear(array, 5);
	
	if (result == 1) {
		System.out.println("Input number there is in the input array");
	} 
	else System.out.println("Input number there is no in the array");
	System.out.println();
		
		
		
	}
}
