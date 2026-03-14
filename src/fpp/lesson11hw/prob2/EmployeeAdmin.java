package fpp.lesson11hw.prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		if (table == null || socSecNums == null) return  null;

		HashSet<String> socsSecSet = new HashSet<>();
		for (String socSec: socSecNums) {
			socsSecSet.add(socSec);
		}

		List<Employee> employees = new ArrayList<>();
		for (Employee employee: table.values()) {
			if (employee != null && socsSecSet.contains(employee.getSsn()) && Double.compare(employee.getSalary(), 80000) > 0) {
				employees.add(employee);
			}
		}

		Collections.sort(employees, (Employee e1, Employee e2) -> e1.getSsn().compareTo(e2.getSsn()));

		return employees;
	}
	
}
