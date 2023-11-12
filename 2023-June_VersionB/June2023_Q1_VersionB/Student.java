package June2023_Q1_VersionB;

import java.util.Scanner;

public class Student {
	private String studentId;
	private String name;
	private String address;
	private String contactNo;
	
	public String getName() {
		return name;
	}

	public Student() {
		Read();
	}
	
	public Student(String studentId, String name, String address, String contactNo) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Student ID :");
		this.studentId = sc.nextLine();
		
		System.out.print("Enter the Student Name :");
		this.name = sc.nextLine();
		
		System.out.print("Enter the Student Address :");
		this.address = sc.nextLine();
		
		System.out.print("Enter the Student Contact No :");
		this.contactNo = sc.nextLine();
		
		System.out.println();
	}
	
	public void Print() {
		
		System.out.println("Student Information :");

		System.out.println("Student ID :" + this.studentId);
		System.out.println("Student Name :" + this.name);
		System.out.println("Student Address :"+ this.address);
		System.out.println("Student Contact No :" + this.contactNo);
		System.out.println();
	
	}
}
