package November2022_Q1_VersionA;

public class PermenentEmp extends Employee{
	private double basicSal;
	private double commission;
	private double netSal;
	
	public PermenentEmp(int id, String name, double basicSal) {
		super(id, name);
		this.basicSal = basicSal;
	}

	@Override
	public void calaculateNetSalary() {
		
		commission = basicSal * 0.15;
		netSal = basicSal + commission;
	}
	
	public void display() {
		super.display();
		System.out.println("Basic Salary :" + basicSal);
		System.out.println("Commission :" + commission);
		System.out.println("Net Salary :" + netSal);
	}

}
