package queue.zadanie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		TaskManager tm = new TaskManager();
		Scanner sc = new Scanner(System.in);
		tm.taskLoop(sc);
	}

}
