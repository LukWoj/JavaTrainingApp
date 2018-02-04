package ownException;

public class SchoolTest {
	public static void main(String[] args) {
		School school = new School(4);
		try {
			school.addStudent(new Student(1, "Jan", "Kowalski"));
            school.addStudent(new Student(2, "Marek", "Bobowski"));
            school.addStudent(new Student(3, "Karol", "Kwiatkowski"));
            school.addStudent(new Student(5, "Ania", "Marciniak"));
		} catch (NoMoreSpaceException e) {
			System.err.println("Nie mo¿na dodaæ takiej iloœci uczniów");
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println(school.findStudent("Marek", "Bobowski"));
            System.out.println(school.findStudent("Janusz", "Danielak"));
		} catch (NoElementFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}