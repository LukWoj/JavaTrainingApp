
/**
 * Napisz program, kt�ry b�dzie pozwala� stworzy� prost� list�
 * To-Do (rzeczy do zrobienia) z mo�liwo�ci� okre�lania priorytet�w.
 * Do reprezentacji pojedynczych zada� utw�rz klas� Task, w kt�rej b�d�
 * pola name (nazwa zadania), description (opcjonalny opis zadania) oraz
 * priority (priorytet) w postaci warto�ci Enum przyjmuj�cej warto��
 * LOW, MODERATE lub HIGH.
 * W klasie TaskManager dodaj prost� logik� aplikacji, pozwalaj�c�
 * wykona� trzy czynno�ci:
 * doda� nowe zadanie pobra� kolejne zadanie o najwy�szym priorytecie do
 * zrobienia wyj�� z aplikacji
 * Kwesti� obs�ugi wyj�tk�w i nietypowych sytuacji mo�esz upro�ci� do
 * minimum.
 */

package queue.zadanie;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import queue.zadanie.Task.Priority;

public class TaskManager {

	private void printOptions() {
		for (UserChoice o : UserChoice.values()) {
			System.out.println(o);
		}
	}

	public enum UserChoice {
		ADD(0, "Dodaj zadanie do listy"), TAKE_TASK(1, "Pobierz zadanie do wykonania"), EXIT(2, "Wyj�cie z programu");
		int option;
		String taskDesc;

		private UserChoice(int opt, String desc) {
			this.option = opt;
			this.taskDesc = desc;
		}

		public static UserChoice createFromInt(int option) {
			return UserChoice.values()[option];
		}

		public String toString() {
			return option + " " + taskDesc;
		}
	}

	public void taskLoop(Scanner sc) {
		Queue<Task> priorityTasks = new PriorityQueue<>();
		UserChoice choice = null;
		while (choice == null || choice != UserChoice.EXIT) {
			printOptions();
			choice = UserChoice.createFromInt(sc.nextInt());
			sc.nextLine();
			switch (choice) {
			case ADD:
				priorityTasks.offer(createNewTask(sc));
				break;
			case TAKE_TASK:
				takeTask(priorityTasks.poll());
				break;
			case EXIT:
				System.out.println("Koniec zada� na dzi�");
			}
		}
	}

	private Task createNewTask(Scanner sc) {
		System.out.println("Podaj nazw� zadania: ");
		String name = sc.nextLine();
		System.out.println("Podaj opis zadania: ");
		String desc = sc.nextLine();
		System.out.println("Podaj priorytet (LOW, MEDIUM, HIGH): ");
		Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
		return new Task(name, desc, priority);
	}

	public static void takeTask(Task task) {
		System.out.println("Zadanie do wykonania: ");
		System.out.println(task);
	}
}