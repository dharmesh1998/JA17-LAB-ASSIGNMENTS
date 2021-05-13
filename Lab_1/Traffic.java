package lab1;
import java.util.*;
public class Traffic {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	String s="";
	while(!s.equals("exit")) {
		System.out.println("Enter \"green\" or \"red\" or \"yellow\" or \"exit\" ");
		s=sc.next();
		switch(s) {
		case "red":
			System.out.println("STOP");
			break;
		case "green":
			System.out.println("go");
			break;
		case "yellow":
			System.out.println("ready");
			break;	
		default:
			System.out.println("Press valid code or Enter exit to get out of loop");
		   
		}
	}
}
}
