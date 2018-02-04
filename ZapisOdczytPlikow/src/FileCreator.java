import java.io.File;
import java.io.IOException;

public class FileCreator {
	public static void main(String[] args) {
		String filename = "textFile.doc";
		File file = new File(filename);
		boolean fileExist = file.exists();

		if (!fileExist) {
			try {
				fileExist = file.createNewFile();
				
			} catch (IOException e1) {
				System.out.println("Utworzenie pliku zakoñczy³o siê niepowodzeniem");
			}

		}
	}
}
