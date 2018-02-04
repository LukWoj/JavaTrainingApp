import java.io.File;

public class DirectoryLister {
	public static void main(String[] args) {
		DirectoryLister dl = new DirectoryLister();
		File file = new File("C:/Users/pl0lwoj/Documents/prywatne/jdk1.8.0_45/Projekty/Test");
		File folder = new File("C:/");

		dl.showDirectories(file);
		dl.showFiles(folder);
	}

	public void showDirectories(File file) {// Metoda zwraca tablic� plik�w i
											// katalog�w w
											// katalogu oznaczonym t�
											// abstrakcyjn� �cie�k�.

		File[] files = file.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) { // checks whether the file denoted by
										// this abstract pathname is a
										// directory.
					System.out.println("folder " + f.getAbsolutePath());
					showDirectories(f);
				} else {
					System.out.println("  plik " + f.getAbsolutePath());
				}
			}
		} else {
			System.out.println("Niepoprawna �cie�ka pliku!!!");
			System.out.println();
		}

	}
		
	
	public void showFiles(File folder) {	// wy�wietla wszystkie foldery w �cie�ce
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
				System.out.println("File " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
	}
}
