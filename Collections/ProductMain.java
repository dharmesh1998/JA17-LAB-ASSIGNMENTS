package cpagemini.com;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Product[] proList;
		
		//allocating the memory for 3 employee objects 
		proList = new Product[3];
		
		//Employee[] empList = new Employee[3];
		
		//Initializing the first array element with employee Object
		proList[0] = new Product(1234,"Rama",100);
		proList[1] = new Product(1235,"Ramana",200);
		proList[2] = new Product(1236, "Ramji",300);
		
		//displaying data in the objects stored in the array using index
		proList[0].displayProDetails();
		proList[1].displayProDetails();
		  //displayEmpDetails with no argument is called
	   proList[2].displayProDetails();
	   
	   Product pro = new Product();
	   Product[] proList1 = new Product[3];
	   Scanner sc = new Scanner(System.in);
	   proList1 =  pro.createProList();

	   
	
		  //displayEmpDetails with employee[] object as argument is called
		  System.out.println("Output from displayEmpDetails with product[] object as argument ");
	  pro.displayProDetails(proList1);
	  
	 /* Product pro2 = new Product();
	  pro2.setPid(1236);
	  pro2.setPname("Ramji");
	  pro2.setPrice(500);
	  System.out.println("Out put from displayEmpDetails with Product object as argument ");
	  //displayEmpDetails with employee object as argument is called
	  pro.displayProDetails(pro2);*/
	   
	  //call find by employee by id
	  int t=1,tt;
	  while(t==1) {
	  System.out.println("Enter choice");
	  int ch1=sc.nextInt();
	  switch(ch1) {
	  
	  case 1:
	  System.out.println("Enter the product id to find an Product");
	  int id = sc.nextInt();
	  pro.findProById(proList1, id);
	  break;
	  
	  //call update by employee by id
	  case 2:
	  System.out.println("Enter the empid to update an Product details");
	  int pid = sc.nextInt();
	  pro.updateproductById(proList1, pid);
	  break;
	  //call delete by employee by id
	  case 3:
	  System.out.println("Enter the empid to delete an Product details");
	  int did = sc.nextInt();
	  pro.deleteProductById(proList1, did);
	  break;
	  case 4:
		  System.out.println("Output from displayProductDetails with product[] object as argument ");
		  pro.displayProDetails(proList1);
		  break;
	 
	  }
	  System.out.println("Enter 1 to continue else type other digit");
	  tt=sc.nextInt();
	  t=tt;
	  }
	}
	
}
