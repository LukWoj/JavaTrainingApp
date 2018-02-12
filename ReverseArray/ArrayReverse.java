
public class ArrayReverse
{
	public void rev(int a[])
	{
		int arrLenght = a.length;
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[arrLenght - 1 - i];
			a[arrLenght - 1 - i] = temp;
		}

	}
}
