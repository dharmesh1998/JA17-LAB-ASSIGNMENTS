import java.util.Scanner;

public class DuplicateInt {  
	public static void main(String[] args) {      
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array length:");
        int n = sc.nextInt();
       int i,j,dup_count=0;
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        	arr[i]=sc.nextInt();     
        i=0;j=0;
		while(i <arr.length) 
		{
			j = i + 1;
			while(j < arr.length)
			{		
				if(arr[i] == arr[j]) {
					dup_count++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("The Total Number of Duplicates  = " + dup_count);



	}
}