package polymorphismcasestudy;

public class Academic extends Payroll{
	
	public void adjustSalary(int salary) {
		
		salary=salary*2;
		System.out.println("Salary of Academic Staff:"+salary);
		
	}
	public void giveLecture() {
		System.out.println("The Name of Academic Staff:"+name);
		adjustSalary(salary);
	}
}
