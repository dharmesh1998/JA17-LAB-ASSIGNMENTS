public class MainAccount {

	public static void main(String[] args) {
		
		Person p1=new Person("DHARMESH", 100.0f);
		Person p2=new Person("SONI", 68.0f);
		
		Account acc1=new Account((long)(Math.random()*Math.pow(10, 16)),1000,p1);
		Account acc2=new Account((long)(Math.random()*Math.pow(10, 16)),3000,p2);
		
		System.out.println("Account No.\tAccount Holder\t\tIntial Balance");
		System.out.println(p1.name+"  "+acc1.accNum+"  "+acc1.balance);
		System.out.println(p2.name+"  "+acc2.accNum+"  "+acc2.balance);
		
		
		acc2.deposit(5000);
		acc1.withdraw(7000);
		System.out.println("Account details are:");
		System.out.println("Account No.\tAccount Holder\t\tIntial Balance");
		System.out.println(p1.name+" "+acc1.accNum+" "+acc1.balance);
		System.out.println(p2.name+" "+acc2.accNum+" "+acc2.balance);
	}

}
