import java.util.*;
class perfect{  
public static void main(String[] args)  {  
Scanner sc=new Scanner(System.in);

               int i, Number, Sum = 0 ;
		Number = sc.nextInt();

		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("It is a Perfect Number");
		}
		else {
			System.out.format("it is NOT a Perfect Number");
		}
}
}