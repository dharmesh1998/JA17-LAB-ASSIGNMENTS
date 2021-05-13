import java.util.*;
class duplicate{  
public static void main(String[] args)  {  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c[]=new int[10];
int count=0;
while(n>0){
int r=n%10;
c[r]++;
n=n/10;
}
for(int i=0;i<10;i++){
if(c[i]>1)
count++;
}
System.out.println("Count of repeated digits="+ count);
}
}