import java.util.*;
public class merge{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter sizes for both the arrays");
int n=sc.nextInt();
int m=sc.nextInt();
int k,i,j;
int ar1[]=new int[n];
int ar2[]=new int[m];
int ar3[]=new int[m+n];

System.out.println("Enter elements of first array");
for(i=0;i<n;i++)
ar1[i]=sc.nextInt();
System.out.println("Enter elements of second array");
for(i=0;i<m;i++)
ar2[i]=sc.nextInt();
for(i=0;i<n;i++)
{
ar3[i]=ar1[i];
}
j=n;
for(i=0;i<m;i++)
{
ar3[j]=ar2[i];
j++;
}
System.out.println("Displaying merged array");
for(i=0;i<m+n;i++)
System.out.println(ar3[i]+" ");
}
}