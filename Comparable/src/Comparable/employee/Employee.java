package Comparable.employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    Date joinDate;

    public Date getJoinDate() {
		return joinDate;
	}
    public String getFirstName() {
		return firstName;
	}
    public String getLastName() {
		return lastName;
	}

    public Employee(String firstName, String lastName, Date joinDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
    }
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return firstName + " " + lastName + " " + dateFormat.format(joinDate);
    }
    /**
     * Sortowanie:
     * 1) comparable natural ordering firstName ---> lastName
     */
    @Override
	public int compareTo(Employee o) { // natural ordering firstName ---> lastName
		int compareValue = this.firstName.compareTo(o.firstName);
		//int compareValue = o.firstName.compareTo(this.firstName);
		if(compareValue == 0) return this.lastName.compareTo(o.lastName);
		return compareValue;
	}
    /*public int compareTo(Employee another) {
        int compareValue = this.joinDate.compareTo(another.joinDate);
        if (compareValue == 0) {
            compareValue = this.firstName.compareTo(another.firstName);
            if (compareValue == 0) {
                return this.lastName.compareTo(another.lastName);
            }
            return compareValue;
        }
        return compareValue;
    }*/
    public static void main(String[] args) throws ParseException {
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	List<Employee> listEmployees = new ArrayList<>();
    	Employee employee1 = new Employee("Tom", "Eagar", dateFormat.parse("2007-12-03"));
    	Employee employee2 = new Employee("Tom", "Smith", dateFormat.parse("2007-12-03"));
    	Employee employee3 = new Employee("Bill", "Joy", dateFormat.parse("2009-01-31"));
    	Employee employee4 = new Employee("Bill", "Gates", dateFormat.parse("2005-05-12"));
    	Employee employee5 = new Employee("Alice", "Wooden", dateFormat.parse("2009-01-22"));
    	listEmployees.add(employee1);
    	listEmployees.add(employee2);
    	listEmployees.add(employee3);
    	listEmployees.add(employee4);
    	listEmployees.add(employee5);
    	Collections.sort(listEmployees);
    	for (Employee employee : listEmployees) {
			System.out.println(employee);
		}
    	System.out.println("Sortowanie JoinDate --> firstName --> lastName ");//total ordering JoinDate --> firstName --> lastName "
    	Collections.sort(listEmployees, new JoinDateCompareEmployee());
    	for (Employee employee : listEmployees) {
			System.out.println(employee);
		}	}




}