
 
import java.util.Scanner;
 
public class Contains {
 
    static public boolean move(String str)
    {
    
    if(str.contains("@") || str.contains("."))
    return true;
    else
    return false;
    }
 
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        if(move(str))
        System.out.println("Yes it contains @ or .");
        else
System.out.println("No @ or . found");

        
    }
}
 