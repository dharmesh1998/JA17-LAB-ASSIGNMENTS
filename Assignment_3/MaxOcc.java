import java.util.*;
public class MaxOcc
{
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
      
        int count[] = new int[ASCII_SIZE];
      
     
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }

    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
        String str =sc.next();
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
    }
}