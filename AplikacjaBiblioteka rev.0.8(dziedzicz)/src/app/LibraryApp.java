package app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Bilioteka v0.7";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
