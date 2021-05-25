package cpagemini.com;
import java.util.*;
public class Product {
	private int pid;
	private String pname;
	private int price;
	
	public Product() {
		super();
	}
	public Product(int pid, String pname,int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price=price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void displayProDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("ProId = " + pid + "Pro name = " + pname+ "Price= "+price );
		System.out.println();
	}

	//displayEmpDetails with Employee Object as argument 
	public void displayProDetails(Product pro) {
		// TODO Auto-generated method stub
		
		System.out.println("empId = " + pro.getPid() + "Emp name = " + pro.getPname() +"Price= "+ pro.getPrice());
		System.out.println();
	}
	
	public void displayProDetails(Product[] pro) {
		for(int i=0; i<pro.length; i++)
		{
			if(pro[i] != null)
				System.out.println("pId: " + pro[i].getPid() + 
						", prodName:" + pro[i].getPname() +
						", prodPrice: " + pro[i].getPrice());
			System.out.println();
		}
		/*for(int i=0;i<pro.length;i++) {
			System.out.println("Id = " + pro[i].getPid() + "name = " + pro[i].getPname()+"Price"+pro[i].getPrice());
			System.out.println();*/
		}
	
	//find an employee by id
	public void findProById(Product[] pro,int id) {
		for(int i=0;i<pro.length;i++) {
			if(pro[i].getPid() == id)
			{
				System.out.println("Product found at " + i);
				System.out.println("Product Id = " + pro[i].getPid() + "Product name = " + pro[i].getPname()+"Price"+pro[i].getPrice());
				break;
			}else {
				System.out.println("No product found");
			}
		}
		System.out.println();
	}
	
	//creating the list of employees using array and returning an array
	   Scanner sc = new Scanner(System.in);
	   Product[] proList1 = new Product[3];
	public Product[] createProList() {
		   for(int i=0;i<proList1.length;i++) {
			   System.out.println("Enter the product details for  "+ i + " pro object");
			   proList1[i] = new Product();
			   proList1[i].setPid(sc.nextInt());
			   proList1[i].setPname(sc.next());
			   proList1[i].setPrice(sc.nextInt());
		   }
		   return proList1;
	}

	//find an employee by id
	public void updateproductById(Product[] pro,int id) {
		for(int i=0;i<pro.length;i++) {
			if(pro[i].getPid() == id)
			{
				System.out.println("Product found at " + i);
				System.out.println("Enter new name to update for the product");
				String updatedname=sc.next();
				pro[i].setPname(updatedname);
				System.out.println("Id = " + pro[i].getPid() + "name = " + pro[i].getPname()+"Price"+pro[i].getPrice());
				break;
			}else {
				System.out.println("No products found");
			}
		}
		System.out.println();
	}
	
	//delete an employee by id
		public Product[] deleteProductById(Product[] pro,int id) {
			/*int originalLength = pro.length;
			for(int i=0;i<originalLength;i++) {
				if(pro[i].getPid() == id)
				{
					System.out.println("Product found at " + i);
					pro[i] = pro[originalLength-1];
					originalLength--;
					break;
				}else {
					System.out.println("No Product found");
				}
			}
			System.out.println();
			return pro;
		}*/
			int originalLength = pro.length;
			boolean found = false;
			for(int i=0; i<originalLength; i++) {
				if(pro[i].getPid() == id)
				{
					System.out.println(" Product id: " + i);
					pro[i] = null;
					System.out.println("Deleted");
					found = true;
					break;
				}
			}
			if(!found)
				System.out.println("Product not found for this id");
			System.out.println();
			return pro;
		}
}
