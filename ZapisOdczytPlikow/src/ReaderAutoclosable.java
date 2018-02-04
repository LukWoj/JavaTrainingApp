import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderAutoclosable {
	public static void main(String[] args) {
        String fileName = "textFile.doc";
         
        try (
            /*FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);*/
        		BufferedReader reader = new BufferedReader( new FileReader("textFile.doc"))
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Iloœæ wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}