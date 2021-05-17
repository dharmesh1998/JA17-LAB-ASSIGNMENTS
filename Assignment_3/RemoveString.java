import java.util.*;   
public class RemoveString {
    static final int NO_OF_CHARS = 256;
 
 
    static int[] getCharCountArray(String str)
    {
        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
 
        return count;
    }
 

    static String removeDirtyChars(String str,
                                   String mask_str)
    {
        int count[] = getCharCountArray(mask_str);
        int ip_ind = 0, res_ind = 0;
 
        char arr[] = str.toCharArray();
 
        while (ip_ind != arr.length)
        {
            char temp = arr[ip_ind];
            if (count[temp] == 0) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
 
        str = new String(arr);

        return str.substring(0, res_ind);
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        String str =sc.next();
        String mask_str =sc.next();
        System.out.println(removeDirtyChars(str, mask_str));
    }
}