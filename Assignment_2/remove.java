import java.util.*;

public class remove {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter size for both the array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements");
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();

        int[] arr_new = new int[arr.length-1];
       System.out.println("Enter the index");
        int j=sc.nextInt();
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }
}