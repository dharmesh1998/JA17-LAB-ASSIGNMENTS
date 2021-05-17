 import java.util.*;
public class SymbolDigitCharacter {
 
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
 
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch))
        System.out.println("It is a character: " + ch);
        else if(Character.isDigit(ch))
        System.out.println("It is a Digit: " + ch);
        else 
        System.out.println("It is a Symbol: " + ch);        
    }
}