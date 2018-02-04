package app;

public class LibraryApp {
	public static void main(String[] args) {
		final String appName = "Biblioteka v0.8";
		System.out.println(appName);
		LibraryControl libControl = new LibraryControl();
		libControl.controlLoop();
	}
}