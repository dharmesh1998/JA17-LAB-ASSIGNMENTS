import java.util.*;
class arm{  
public static void main(String[] args)  {  
Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int sum=0,d,temp=n,fact;
		while(n>0)
		{
			 d=n%10;
			 fact=1;
			 for(int i=1;i<=d;i++)
			 {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 n=n/10;
			}
		if(sum==temp)
			System.out.println("IT IS A STRONG NUMBER");
		else
			System.out.println("IT IS NOT A STRONG NUMBER");

      
   }  
}  