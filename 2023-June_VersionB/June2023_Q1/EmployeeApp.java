package June2023_Q1;

import java.util.ArrayList;

public class EmployeeApp {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList();
		
		list.add(new Employee("EMP101" , "Kamal Perera" , "Colombo"));
		list.add(new Employee("EMP102" , "Sunil Fernando" , "Kandy"));
		
		list.add(new Manager("EMP103", "Nimali Herath" , "Kadawatha" , "Marketing" , 10001,10002,10003));
		list.add(new Manager("EMP104", "Hansika Perera" , "Rathnapura" , "Marketing" , 20001,20002,20003));
		
		for(Employee emp : list) {
			emp.Print();
			System.out.println();
		}
	}
}
