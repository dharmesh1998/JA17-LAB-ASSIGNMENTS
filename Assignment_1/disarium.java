import java.util.Scanner;

public class disarium {

    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a number : ");
            int num = sc.nextInt();
            int t = num, d = 0, sum = 0;
            String s = Integer.toString(num);  
            int len = s.length();  
             
            while(t>0)
            {
                d = t % 10;  
                sum = sum + (int)Math.pow(d,len);
                len--;
                t = t / 10;
            }
             
            if(sum == num)
                System.out.println("Disarium Number.");
            else
                System.out.println("Not a Disarium Number.");
        }
    }