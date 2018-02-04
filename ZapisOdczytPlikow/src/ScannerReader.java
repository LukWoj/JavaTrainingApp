import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class ScannerReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "textFile.doc";
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
         
        int lines = 0;
        while(scan.hasNextLine()) {
            String name = scan.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Iloœæ wierszy w pliku: " + lines);
        scan.close();
    }
}

