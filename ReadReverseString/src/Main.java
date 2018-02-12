
public class Main
{
	public static void main(String args[]) {
		
		System.out.println(reverseWord("Ala"));
		String a = "Ma kota";
		char i = 'a';
		String result = a+i;
		System.out.println(result);
	}
	public static String reverseWord(String someWord) {
		
		char[] chars = someWord.toCharArray();
		
		for(int index = 0; index < chars.length / 2; index++) {
			 char leftSideOfWord = chars[index];
			 int newCharIndexRight = chars.length - index -1;
			 chars[index] = chars[newCharIndexRight];
			 chars[newCharIndexRight] = leftSideOfWord;
			}
		
		String result = "";
		for (int i=0; i < chars.length; i++) {
			result = result + chars[i];
		}
        return result;
	}
}
