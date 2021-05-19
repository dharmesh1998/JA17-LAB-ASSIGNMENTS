package polymorphismcasestudy;
import java.util.*;
public class Payroll {
String name;
int salary;
Scanner sc=new Scanner(System.in);
public void getDetails() {
	System.out.println("Enter Name");
	name=sc.next();
	System.out.println("Enter Salary");
	salary=sc.nextInt();
}
public void adjustSalary(int salary) {
	System.out.println("This is Payroll Class");
	
}
public void ShowDetails() {
	System.out.println("Enter Name"+name);
	
	System.out.println("Enter Salary"+salary);
	
}


}
