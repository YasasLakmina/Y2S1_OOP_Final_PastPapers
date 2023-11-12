package November2022_Q1_VersionA;

public class TemporaryEmp extends Employee{
	private int OtHrs;
	private double OtRate;
	private double minWage;
	private double netSal;
	
	public TemporaryEmp(int id, String name, int otHrs, double otRate) {
		super(id, name);
		OtHrs = otHrs;
		OtRate = otRate;
		this.minWage = 15000;
	}
	@Override
	public void calaculateNetSalary() {
		netSal = minWage + (OtHrs * OtRate);
	}
	
	public void display() {
		super.display();
		System.out.println("Minimum Wage :" + minWage);
		System.out.println("Net Salary :" + netSal);
	}
	
	
}
