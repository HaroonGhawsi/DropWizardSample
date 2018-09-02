package com.haroon.rest.dao;

public class EmployeeDB {
	
	public static HashMap<Integer, Employee> employees = new HashMap();
	
	static {
		employees.put(1, new Employee(1, "Lokesh", "Gupta", "India"));
		employees.put(2, new Employee(2, "John", "Gruber", "USA"));
		employees.put(3, new Employee(3, "Melcum", "Marschal", "AUS"));
	}
	
	public static List<Employee> getEmployees(){
		return new ArrayList<Employee>(employees.value());
	}
	
	public static Employee getEmployee(Integer id) {
		return employee.get(id);
	}
	
	public static void updateemployee(Integer id, Employee employee) {
		employees.put(id, employee);
	}
	
	public static void removeEmployee(Integer id) {
		employees.remove(id);
	}

}
