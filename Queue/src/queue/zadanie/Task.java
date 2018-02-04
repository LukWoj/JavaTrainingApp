package queue.zadanie;

public class Task implements Comparable<Task> {

	private String name;// nazwa zadania
	private String description;// opcjonalny opis zadania
	private Priority priority;// priorytet

	public Task(String name, String description, Priority priority) {
		setName(name);
		setDescription(description);
		setPriority(priority);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return name + " - " + description;
	}

	enum Priority {
		HIGH, MEDIUM, LOW;
	}

	public int compareTo(Task o) {
		return getPriority().compareTo(o.priority);

	}
}
