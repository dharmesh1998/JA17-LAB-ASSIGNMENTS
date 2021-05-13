import java.util.*;
class dpa{  
public static void main(String[] args)  {  
        int defi = 0;
        int per = 0;
        int abun= 0;
     int i,j,sum=0;
        for ( i = 1; i <=10000; i++) {

          for(j = 1 ; j < i ; j++) {
			if(i%j == 0)  {
				sum = sum + j;
			}
		
           }
            if (sum < j)
                defi++;
            else if (sum == j)
                per++;
            else
                abun++;

sum=0;
        
}
        System.out.println("Deficient number: " + defi);
        System.out.println("Perfect number: " + per);
        System.out.println("Abundant number: " + abun);
    }
   
}