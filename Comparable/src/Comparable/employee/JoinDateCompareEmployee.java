package Comparable.employee;

import java.util.Comparator;
//http://www.codejava.net/java-core/collections/understanding-object-ordering-in-java-with-comparable-and-comparator
public class JoinDateCompareEmployee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int joinDate = o1.getJoinDate().compareTo(o2.getJoinDate());
		if(joinDate == 0) {
			return o1.compareTo(o2);
		}
		return joinDate;
	}
	

}
