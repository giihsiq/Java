package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary () {
		return (grossSalary - tax);
	}
	
	public String toString() {
		return name + ",  $ " +
	String.format("%.2f", netSalary());
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	
	

}
