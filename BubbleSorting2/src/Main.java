import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj d�ugo�� tablicy");
        int arrayLenght = scanner.nextInt();
        int[] numbers = new int[arrayLenght];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczb� na " + (i + 1) + " element tablicy");
            numbers[i] = scanner.nextInt();
        }
        BubbleSort.bubbleSorting(numbers);
        for(int y: numbers) {
        	System.out.println(y);
        }
       
    }
	}


