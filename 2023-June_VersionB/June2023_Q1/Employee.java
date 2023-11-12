package June2023_Q1;

import java.util.Scanner;

public class Employee {
	private String EmpId;
	private String name;
	private String address;
	
	public Employee(String empId, String name, String address) {
		EmpId = empId;
		this.name = name;
		this.address = address;
	}
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID :");
		this.EmpId = sc.nextLine();
		
		System.out.print("Enter Employee Name :");
		this.name = sc.nextLine();
		
		System.out.print("Enter Employee Address :");
		this.address = sc.nextLine();

	}
	
	public void Print() {
		System.out.println("Employee ID :" + this.EmpId);
		System.out.println("Employee Name :" + this.name);
		System.out.println("Employee Address :" + this.address);
	}
	
}
