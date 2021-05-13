package lab1;
import java.util.*;
public class Cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int a = sc.nextInt();
		System.out.println("Sum of cubes="+user(a));
	}
	static int user(int a) {
		int sum=0,n;
		while(a!=0)
		{
		n = a%10;
		sum = sum +(n*n*n);
		a = a/10;

		}
		return sum;
	}

}
