package polymorphismcasestudy;

public class Admin extends Payroll {
	public void adjustSalary(int salary) {
		salary=salary*3;
		System.out.println("This is Salary of Admin: "+salary);
		
	}
	public void doAdminStuff() {
		System.out.println("Admin Name: "+name);
		adjustSalary(salary);
	}
}
