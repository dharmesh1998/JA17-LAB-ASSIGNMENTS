import java.util.*;   
public class Palindrome  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; 
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string");  
    String ss=in.nextLine();
 System.out.println("Enter the indexes of substring");
     int a=in.nextInt();
 int b=in.nextInt();
 
      original = ss.substring(a,b+1);   
      int length = original.length();
        
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  