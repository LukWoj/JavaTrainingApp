import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private File file;

	public void fileCreator(String fileName) {
		file = new File(fileName);
		boolean existTest = file.exists();
		try {
			if (!existTest) {
				file.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("Nie uda³o siê utworzyæ pliku");
		}
	}

	public void numberWriter(String fileName) {
		try (FileWriter fw = new FileWriter(fileName); BufferedWriter br = new BufferedWriter(fw);) {
			br.write("123");
			br.newLine();
			br.write("1234");
			br.newLine();
			br.write("12345");
			br.newLine();
			br.write("123456789123456789");
			br.newLine();
			br.write("987654321987654321");
		} catch (IOException e) {
			System.out.println("Blad odczytu pliku");
		}
	}

	public static void main(String[] args) {
		Main ob = new Main();
		ob.fileCreator("numbers.txt");
		ob.numberWriter("numbers.txt");
		int a = 0, b = 0, c = 0;
		BigInteger aBig = null, bBig = null;
		try (FileReader fr = new FileReader("numbers.txt"); BufferedReader br = new BufferedReader(fr);

		) {

			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			c = Integer.parseInt(br.readLine());
			aBig = new BigInteger(br.readLine());
			bBig = new BigInteger(br.readLine());
			System.out.println("a+b+c = " + (a + b + c));
			System.out.println("aBig+bBig = " + aBig.add(bBig));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
