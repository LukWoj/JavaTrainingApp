package ownException;

public class School {
	private Student[] students;
	private int studentsNumber;

	public School(int studentsNumber) {
		students = new Student[studentsNumber];
		this.studentsNumber = 0;

	}

	public void addStudent(Student s) throws NoMoreSpaceException {
		if (studentsNumber >= students.length) {
			throw new NoMoreSpaceException("Brak miejsc w szkole ");
		} else {
			students[studentsNumber] = s;
			studentsNumber++;
		}
	}

	public Student findStudent(String firstName, String surname) throws NoElementFoundException {
		Student foundStudent = null;
		boolean found = false;
		int index = 0;
		while (index < students.length && (! found)) {
			if (students[index].getFirstName().equals(firstName) && students[index].getLastName().equals(surname)) {
			foundStudent = students[index];
			found = true;
			} else {
				index++;
			}
		}
		if (foundStudent == null) {
			throw new NoElementFoundException( '\n' +"Nie znaleziono studenta o parametrach: " + firstName +" " + surname );
		}
		return foundStudent;

	}
}
