
/**
 * Napisz program, który bêdzie pozwala³ stworzyæ prost¹ listê
 * To-Do (rzeczy do zrobienia) z mo¿liwoœci¹ okreœlania priorytetów.
 * Do reprezentacji pojedynczych zadañ utwórz klasê Task, w której bêd¹
 * pola name (nazwa zadania), description (opcjonalny opis zadania) oraz
 * priority (priorytet) w postaci wartoœci Enum przyjmuj¹cej wartoœæ
 * LOW, MODERATE lub HIGH.
 * W klasie TaskManager dodaj prost¹ logikê aplikacji, pozwalaj¹c¹
 * wykonaæ trzy czynnoœci:
 * dodaæ nowe zadanie pobraæ kolejne zadanie o najwy¿szym priorytecie do
 * zrobienia wyjœæ z aplikacji
 * Kwestiê obs³ugi wyj¹tków i nietypowych sytuacji mo¿esz uproœciæ do
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
		ADD(0, "Dodaj zadanie do listy"), TAKE_TASK(1, "Pobierz zadanie do wykonania"), EXIT(2, "Wyjœcie z programu");
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
				System.out.println("Koniec zadañ na dziœ");
			}
		}
	}

	private Task createNewTask(Scanner sc) {
		System.out.println("Podaj nazwê zadania: ");
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