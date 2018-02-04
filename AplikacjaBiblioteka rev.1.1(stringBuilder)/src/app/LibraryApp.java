package app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Bilioteka v1.1";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();


    }
}
