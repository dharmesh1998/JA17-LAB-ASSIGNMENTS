
 
import java.util.Scanner;
 
public class FrontUpper {
 
    static public String move(String str)
    {
    
        int len = str.length();
 
      
        String low = "";
 

        String upr = "";
 

        char ch;
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
 
         
            if (ch >= 'A' && ch <= 'Z') {
                upr += ch;
            }
            else {
                low += ch;
            }
        }
        return upr+low;
    }
 
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Before Operation:   " + str);
        System.out.println("After Operation:    " + move(str));
    }
}
 