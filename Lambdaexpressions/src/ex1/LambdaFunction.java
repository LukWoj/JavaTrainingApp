package ex1;
import java.util.function.Function;

public class LambdaFunction {

	public String getLowerCaseTrimm(String original) {
		return original.toLowerCase().trim();
	}

	public static void main(String[] args) {
		Function<String, String> func = (String str) -> str.toLowerCase().trim();
		String original = "   WIELKI NAPIS ALI ";
		String lowerCaseTrim = func.apply(original);
		System.out.println(lowerCaseTrim);
	}
}
