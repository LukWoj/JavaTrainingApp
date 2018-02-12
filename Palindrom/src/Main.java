
public class Main
{

	public static void main(String[] args)
	{
		boolean palindrom = isPalindrom("tenet");
		System.out.println(palindrom);
		String a = "a";
		String b = "b";
		
	}

	private static boolean isPalindrom(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char currentLetterFromBegin = chars[i];
            char appropriateLetterFromEnd = chars[chars.length - i - 1];
            if (!(currentLetterFromBegin == appropriateLetterFromEnd)) {
                return false;
            }
        }
return true;
	}
}
