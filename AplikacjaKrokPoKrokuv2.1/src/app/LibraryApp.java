package app;

public class LibraryApp {
	public static void main(String[] args) {
		final String appName = "Biblioteka v2.1";
		System.out.println(appName);
		LibraryControl libControl = new LibraryControl();
		libControl.controlLoop();
	}
}