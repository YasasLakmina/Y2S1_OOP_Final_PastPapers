package June2023_Q1;

import java.util.Scanner;

public class Manager extends Employee{
	private String Department;
	private int ProductNo1;
	private int ProductNo2;
	private int ProductNo3;
	
	
	public Manager(String empId, String name, String address, String department, int productNo1, int productNo2,
			int productNo3) {
		super(empId, name, address);
		Department = department;
		ProductNo1 = productNo1;
		ProductNo2 = productNo2;
		ProductNo3 = productNo3;
	}
	
	public void Read() {
		super.Read();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Department :");
		this.Department = sc.nextLine();
		
		try {
			System.out.print("Enter the ProductNo 1:");
			this.ProductNo1 = sc.nextInt();
			
			System.out.print("Enter the ProductNo 2:");
			this.ProductNo2 = sc.nextInt();
			
			System.out.print("Enter the ProductNo 3:");
			this.ProductNo3 = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Invalid Product Numbers");
		}
		
	}
	
	public void Print() {
		
		super.Print();
		
		System.out.println("Department :" + this.Department);
		System.out.println("Product No1:" + this.ProductNo1);
		System.out.println("Product No2:" + this.ProductNo2);
		System.out.println("Product No3:" + this.ProductNo3);
	}
	
	
	
	
}
