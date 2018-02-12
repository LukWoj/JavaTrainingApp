
public class BubbleSort
{
	
	
	public static int[] bubbleSorting (int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
		return array;
	}
	
	private static int[] bubbleSortingV2(int[] array)
	{
		for (int i = 0; i < array.length-1; i++) {
			if(array[i] > array[i+1]) {
				int tmp = array[i+1];
				array[i+1] = array[i];
				array[i] = tmp;
			}
		}
		return array;

	}
	
}
 