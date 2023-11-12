package November2022_Q1_VersionA;

import java.util.ArrayList;

public class DemoApp {
	public static void main(String[] args) {
		ArrayList<PermenentEmp> list = new ArrayList();
		
		list.add(new PermenentEmp(101,"Nimali" , 56000));
		list.add(new PermenentEmp(102,"Amal" , 74000));
		
		for(PermenentEmp emp : list) {
			emp.calaculateNetSalary();
			emp.display();
			System.out.println();
		}
		
		ArrayList<TemporaryEmp> list1 = new ArrayList();
		
		list1.add(new TemporaryEmp(101,"Nimali",9 , 2100));
		list1.add(new TemporaryEmp(102,"Amal", 10 , 1255));
		
		for(TemporaryEmp emp : list1) {
			emp.calaculateNetSalary();
			emp.display();
			System.out.println();
		}
	}
}
