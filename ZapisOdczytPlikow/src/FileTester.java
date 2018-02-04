import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class FileTester {
    public static void main(String[] args) {
        String fileName = "textFile.doc";
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            while ((reader.readLine()) != null) {
                System.out.println(reader.readLine());
                lines++;
            }
            System.out.println("Iloœæ wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
