package November2022_Q1_VersionA;

public abstract class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Employee ID :" + this.id);
		System.out.println("Employee Name :" + this.name);
	}
	
	public abstract void calaculateNetSalary();
}
