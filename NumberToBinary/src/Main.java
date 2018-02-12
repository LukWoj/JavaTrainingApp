public class Main {
	
	 public static void main(String[] args) {
		 String binary = reverseBinary(2);
		 String correctBinary = correctBinary(binary);
		 System.out.println("Odwrócona liczba binarna");
		 System.out.println(binary);
		 System.out.println("Prawidlowa liczba binarna");
		 System.out.println(correctBinary);
		 
	 	}

	 private static String correctBinary(String word) {
        char[] chars = word.toCharArray();
        for (int currentCharIndex = 0; currentCharIndex < chars.length / 2; currentCharIndex++) {
            char tempChar = chars[currentCharIndex];
            int curretnCharFromEndIndex = chars.length - currentCharIndex - 1;

            chars[currentCharIndex] = chars[curretnCharFromEndIndex];
            chars[curretnCharFromEndIndex] = tempChar;
        }
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
        return result;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
	 private static String reverseBinary(int number) {
		 String reverseBinaryWord = "";
		 while(number > 0) {
			 reverseBinaryWord = reverseBinaryWord + number%2;  
			 number = number/2;
		 }
	return reverseBinaryWord; 
	 	}

}

/*import javax.swing.JOptionPane;
	public class Main {
		//Program zamieniaj¹cy liczbê dziesiêtn¹ na binarn¹.
		public static void main(String[] args) {
			int x= Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe: "));	
			System.out.print("Sprawdzenie - liczba w zapisie binarnym: "+Integer.toBinaryString(x));
		}
	}*/